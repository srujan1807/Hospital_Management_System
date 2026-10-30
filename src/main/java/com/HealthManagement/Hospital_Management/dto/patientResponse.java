package com.HealthManagement.Hospital_Management.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class patientResponse {

    private Long id;
    private String patientCode;
    private String firstName;
    private String lastName;
    private String age;
    private String Gender;
    private String phoneNumber;
    private String email;
    private String bloodGroup;
    private String aadharNumber;
    private String address;
    private String emergencyContent;
    private String admitdate;
    private String status;

}
