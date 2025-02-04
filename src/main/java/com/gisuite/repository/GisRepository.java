package com.gisuite.repository;

import com.gisuite.entity.GisEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GisRepository extends JpaRepository<GisEntity, Long> {

    // 특정 좌표 내 데이터 검색 (예제)
    @Query("SELECT g FROM GisEntity g WHERE ST_Contains(g.geometry, ST_GeomFromText(:wkt, 4326)) = true")
    List<GisEntity> findWithinGeometry(String wkt);

    // 특정 속성으로 데이터 검색
    List<GisEntity> findByName(String name);
}
