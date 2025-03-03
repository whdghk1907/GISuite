package com.gisuite.service;

import com.gisuite.entity.GisEntity;
import com.gisuite.repository.GisRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * GIS 데이터에 대한 서비스 클래스 (ISO 19125 표준 준수)
 */
@Service
public class GisService {

    private final GisRepository gisRepository;

    public GisService(GisRepository gisRepository) {
        this.gisRepository = gisRepository;
    }

    /**
     * 모든 GIS 데이터를 조회
     * @return 모든 GIS 엔티티 목록
     */
    public List<GisEntity> getAllFeatures() {
        return gisRepository.findAll();
    }

    /**
     * ID를 통해 특정 GIS 데이터를 조회
     * @param id GIS 엔티티의 고유 ID
     * @return 해당 ID에 해당하는 GIS 엔티티 (Optional)
     */
    public Optional<GisEntity> getFeatureById(Long id) {
        return gisRepository.findById(id);
    }

    /**
     * GIS 데이터를 저장
     * @param gisEntity 저장할 GIS 엔티티
     * @return 저장된 GIS 엔티티
     */
    @Transactional
    public GisEntity addFeature(GisEntity gisEntity) {
        return gisRepository.save(gisEntity);
    }

    /**
     * GIS 데이터를 삭제
     * @param id 삭제할 GIS 엔티티의 ID
     */
    @Transactional
    public void removeFeature(Long id) {
        gisRepository.deleteById(id);
    }
}
