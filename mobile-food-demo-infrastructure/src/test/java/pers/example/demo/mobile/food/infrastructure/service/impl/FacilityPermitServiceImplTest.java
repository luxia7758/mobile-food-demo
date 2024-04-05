package pers.example.demo.mobile.food.infrastructure.service.impl;

import pers.example.demo.mobile.food.application.service.FacilityPermitService;
import pers.example.demo.mobile.food.domain.FacilityPermit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class FacilityPermitServiceImplTest {

    private FacilityPermitService test = new FacilityPermitServiceCsvImpl();

    @Test
    void testFindAll() {
        List<FacilityPermit> result = test.findAll();

        Assertions.assertEquals(481, result.size());

    }

    @Test
    void testFindById() {
        FacilityPermit result = test.findById("1652619").get();

        Assertions.assertEquals("250 04TH ST",result.getAddress());
        Assertions.assertEquals("3733008",result.getBlocklot());

    }


    @Test
    void testFindByIdNotFound() {

        Assertions.assertTrue(test.findById("ccc").isEmpty());
    }


}