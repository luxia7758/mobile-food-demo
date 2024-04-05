package pers.example.demo.mobile.food.application.service;

import pers.example.demo.mobile.food.domain.FacilityPermit;

import java.util.List;
import java.util.Optional;

/**
 * @author
 * @since
 */
public interface FacilityPermitService {

    /**
     * find all data
     * @return
     */
    List<FacilityPermit> findAll();

    /**
     * find by id
     * @param id
     * @return
     */
    Optional<FacilityPermit> findById(String id);

}
