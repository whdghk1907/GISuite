package com.gisuite.entity;

import com.gisuite.annotation.UML;
import com.gisuite.annotation.Obligation;
import jakarta.persistence.*;

@Entity
@Table(name = "crs")
@UML(identifier = "SC_ProjectedCRS", specification = "ISO_19111")
public class CRS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @UML(identifier = "name", specification = "ISO_19111", obligation = Obligation.MANDATORY)
    @Column(nullable = false)
    private String name;

    @UML(identifier = "coordinateSystem", specification = "ISO_19111", obligation = Obligation.MANDATORY)
    @Column(nullable = false)
    private String coordinateSystem;

    // 기본 생성자
    public CRS() {}

    public CRS(String name, String coordinateSystem) {
        this.name = name;
        this.coordinateSystem = coordinateSystem;
    }

    // Getter 및 Setter
    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCoordinateSystem() { return coordinateSystem; }
    public void setCoordinateSystem(String coordinateSystem) { this.coordinateSystem = coordinateSystem; }
}
