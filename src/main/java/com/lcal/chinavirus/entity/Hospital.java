package com.lcal.chinavirus.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // TODO: 2020-04: data type변경 필요
    // 기준일 정보
    @Column(name ="standard_date")
    private String standardDate;

    @Column(name="location")
    private String location;

    @Column(name="hospital_name")
    private String hospitalName;

    @Column(name="address")
    private  String address;

    @Column(name="apply_type")
    private char applyType;

    @Column(name="phone")
    private String phone;
    
    @Builder
    public Hospital (String standardDate,
                    String location,String hospitalName,
                    String address, char applyType, String phone){
        this.standardDate = standardDate;
        this.location = location;
        this.hospitalName = hospitalName;
        this.address = address;
        this.applyType = applyType;
        this.phone = phone;
    }
}

