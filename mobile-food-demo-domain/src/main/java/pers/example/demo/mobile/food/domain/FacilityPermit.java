package pers.example.demo.mobile.food.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "Facility Permit", description = "Facility Permit Desc")
@Entity
public class FacilityPermit {

    @Id
    private String locationid;
    private String applicant;
    private String facilityType;
    private String cnn;
    private String locationDescription;
    private String address;
    private String blocklot;
    private String block;
    private String lot;
    private String permit;
    private String status;
    private String foodItems;
    private String x;
    private String y;
    private String latitude;
    private String longitude;
    private String schedule;
    private String dayshours;
    private String noiSent;
    private String approved;
    private String received;
    private String priorPermit;
    private String expirationDate;
    private String location;
    private String firePreventionDistricts;
    private String policeDistricts;
    private String supervisorDistricts;
    private String zipCodes;
    private String neighborhoodsOld;



}
