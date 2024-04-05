package pers.example.demo.mobile.food.infrastructure.service.impl;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import pers.example.demo.mobile.food.application.service.FacilityPermitService;
import pers.example.demo.mobile.food.domain.FacilityPermit;
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
public class FacilityPermitServiceCsvImpl implements FacilityPermitService {


    private List<FacilityPermit> cache = null;

    /**
     * as a demo version, just read local file
     * @return
     */
    private void read() {

        try {

            Reader in = new FileReader(this.getClass().getResource("/").getFile() + "Mobile_Food_Facility_Permit.csv");
            Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
            cache = FacilityPermitConvert.INSTANCE.toEntity(records);

        } catch (Exception e) {
            //demo version, do nothing
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<FacilityPermit> findAll() {
        if (cache == null) {
            read();
        }
        return cache;

    }

    @Override
    public Optional<FacilityPermit> findById(String id) {
        //use filter instead
        Optional<FacilityPermit> any = findAll().stream().filter(fp -> fp.getLocationid().equals(id)).findAny();
        return any;
    }
}
