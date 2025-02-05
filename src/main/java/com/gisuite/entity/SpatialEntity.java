package com.gisuite.entity;

import com.gisuite.annotation.UML;
import jakarta.persistence.*;

@Entity
@Table(name = "spatial_entity")
@UML(identifier = "GM_Object", specification = "ISO_19107")
public class SpatialEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @UML(identifier = "geometry", specification = "ISO_19107", obligation = Obligation.MANDATORY)
    @Column(nullable = false, columnDefinition = "GEOMETRY")
    private String geometry;

    @ManyToOne
    @JoinColumn(name = "crs_id", nullable = false)
    private CRS crs;

    // 기본 생성자
    public SpatialEntity() {}

    public SpatialEntity(String geometry, CRS crs) {
        this.geometry = geometry;
        this.crs = crs;
    }

    // Getter 및 Setter
    public Long getId() { return id; }
    public String getGeometry() { return geometry; }
    public void setGeometry(String geometry) { this.geometry = geometry; }
    public CRS getCrs() { return crs; }
    public void setCrs(CRS crs) { this.crs = crs; }
}
