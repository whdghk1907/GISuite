package com.gisuite.service;

import com.gisuite.entity.GisEntity;
import com.gisuite.repository.GisRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class GisService {

    private final GisRepository gisRepository;

    public GisService(GisRepository gisRepository) {
        this.gisRepository = gisRepository;
    }

    public List<GisEntity> getAllGisData() {
        return gisRepository.findAll();
    }

    public Optional<GisEntity> getGisDataById(Long id) {
        return gisRepository.findById(id);
    }

    @Transactional
    public GisEntity saveGisData(GisEntity gisEntity) {
        return gisRepository.save(gisEntity);
    }

    @Transactional
    public void deleteGisData(Long id) {
        gisRepository.deleteById(id);
    }
}