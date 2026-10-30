package com.HealthManagement.Hospital_Management.dto;

import com.HealthManagement.Hospital_Management.Enum.DoctorStatus;
import com.HealthManagement.Hospital_Management.Enum.Gender;
import lombok.Data;

@Data
public class DoctorRequest {

    private String doctorCode;

    private String firstName;

    private String lastName;

    private Gender gender;

    private String specialization;

    private String qualification;

    private Integer experience;

    private String phoneNumber;

    private String email;

    private String address;

    private String joiningDate;

    private Double consultationFee;

    private DoctorStatus status;
}
