package pers.example.demo.mobile.food.infrastructure.service.impl;

import jakarta.annotation.Resource;
import pers.example.demo.mobile.food.application.service.FacilityPermitService;
import pers.example.demo.mobile.food.domain.FacilityPermit;
import pers.example.demo.mobile.food.repository.FacilityPermitRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author
 * @since
 */
@Service
public class FacilityPermitServiceJpaImpl implements FacilityPermitService {


    @Resource
    private FacilityPermitRepository repository;


    @Override
    public List<FacilityPermit> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<FacilityPermit> findById(String id) {
        return repository.findById(id);
    }
}
