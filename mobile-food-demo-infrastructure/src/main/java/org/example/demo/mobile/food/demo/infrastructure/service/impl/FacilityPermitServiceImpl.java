package org.example.demo.mobile.food.demo.infrastructure.service.impl;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.example.demo.mobile.food.application.service.FacilityPermitService;
import org.example.demo.mobile.food.domain.FacilityPermit;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.Reader;
import java.util.List;
import java.util.Optional;

/**
 * @author
 * @since
 */
@Service
public class FacilityPermitServiceImpl implements FacilityPermitService {


    private Iterable<CSVRecord> cache = null;

    /**
     * as a demo version, just read local file
     * @return
     */
    private Iterable<CSVRecord> read() {

        try {
            if (cache != null) {
                return cache;
            }
            Reader in = new FileReader(this.getClass().getResource("/").getFile() + "Mobile_Food_Facility_Permit.csv");
            Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
            cache = records;
            return records;

        } catch (Exception e) {
            //demo version, do nothing
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<FacilityPermit> findAll() {
        return FacilityPermitConvert.INSTANCE.toEntity(read());

    }

    @Override
    public Optional<FacilityPermit> findById(String id) {
        //use filter instead
        return findAll().stream().filter(fp -> fp.getLocationid().equals(id)).findAny();
    }
}
