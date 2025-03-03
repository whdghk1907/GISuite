package com.gisuite.entity;

import jakarta.persistence.*;
import org.locationtech.jts.geom.Geometry;
import com.gisuite.annotation.UML;

/**
 * ISO 19125 (Simple Feature Access) 표준에 맞춘 GIS 엔티티 클래스
 */
@UML(identifier = "GisEntity", specification = "ISO_19125")
@Entity
@Table(name = "gis_data")
public class GisEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @UML(identifier = "name", specification = "ISO_19125")
    @Column(name = "name", nullable = false)
    private String name;

    @UML(identifier = "geometry", specification = "ISO_19125")
    @Column(name = "geometry", columnDefinition = "Geometry", nullable = false)
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
