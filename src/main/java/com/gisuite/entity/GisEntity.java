package com.gisuite.entity;

import jakarta.persistence.*;
import org.locationtech.jts.geom.Geometry;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "gis_data")
public class GisEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "Geometry")
    private Geometry geometry;

    public GisEntity() {
    }

    public GisEntity(String name, Geometry geometry) {
        this.name = name;
        this.geometry = geometry;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }
}
