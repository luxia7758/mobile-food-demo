package pers.example.demo.mobile.food.infrastructure.service.impl;


import org.apache.commons.csv.CSVRecord;
import pers.example.demo.mobile.food.domain.FacilityPermit;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Map;

/**
 * @author
 */
@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface FacilityPermitConvert {

    FacilityPermitConvert INSTANCE = Mappers.getMapper(FacilityPermitConvert.class);

    List<FacilityPermit> toEntity(Iterable<CSVRecord> pos);

    default FacilityPermit toEntity(CSVRecord po) {
        return toEntity(po.toMap());
    }

    //Applicant	FacilityType	cnn	LocationDescription	Address	blocklot	block	lot	permit	Status	FoodItems	X	Y
    // Latitude	Longitude	Schedule	dayshours	NOISent	Approved	Received	PriorPermit	ExpirationDate	Location	Fire Prevention Districts	Police Districts	Supervisor Districts	Zip Codes	Neighborhoods (old)
    @Mapping(target = "locationid", source = "locationid")
    @Mapping(target = "applicant", source = "Applicant")
    @Mapping(target = "facilityType", source = "FacilityType")

    @Mapping(target = "locationDescription", source = "LocationDescription")
    @Mapping(target = "address", source = "Address")

    @Mapping(target = "status", source = "Status")
    @Mapping(target = "foodItems", source = "FoodItems")
    @Mapping(target = "x", source = "X")
    @Mapping(target = "y", source = "Y")
    @Mapping(target = "latitude", source = "Latitude")
    @Mapping(target = "longitude", source = "Longitude")
    @Mapping(target = "schedule", source = "Schedule")

    @Mapping(target = "noiSent", source = "NOISent")
    @Mapping(target = "approved", source = "Approved")
    @Mapping(target = "received", source = "Received")
    @Mapping(target = "priorPermit", source = "PriorPermit")
    @Mapping(target = "expirationDate", source = "ExpirationDate")
    @Mapping(target = "location", source = "Location")
    @Mapping(target = "firePreventionDistricts", source = "Fire Prevention Districts")
    @Mapping(target = "policeDistricts", source = "Police Districts")
    @Mapping(target = "supervisorDistricts", source = "Supervisor Districts")
    @Mapping(target = "zipCodes", source = "Zip Codes")
    @Mapping(target = "neighborhoodsOld", source = "Neighborhoods (old)")
    FacilityPermit toEntity(Map<String, String> po);

}
