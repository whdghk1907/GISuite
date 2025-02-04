package com.gisuite.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import jakarta.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import java.util.Properties;

@Configuration
@EnableJpaRepositories(basePackages = "com.gisuite.repository")
public class DatabaseConfig {

    @Value("${spring.datasource.url}")
    private String databaseUrl;

    @Value("${spring.datasource.username}")
    private String databaseUsername;

    @Value("${spring.datasource.password}")
    private String databasePassword;

    @Value("${spring.datasource.driver-class-name}")
    private String databaseDriver;

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .url(databaseUrl)
                .username(databaseUsername)
                .password(databasePassword)
                .driverClassName(databaseDriver)
                .build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource());
        em.setPackagesToScan("com.gisuite.entity");

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        em.setJpaProperties(hibernateProperties());

        return em;
    }

    private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", "org.hibernate.spatial.dialect.postgis.PostgisDialect");
        properties.setProperty("hibernate.show_sql", "true");
        properties.setProperty("hibernate.format_sql", "true");
        return properties;
    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }
}
