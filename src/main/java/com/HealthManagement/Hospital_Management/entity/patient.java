package com.HealthManagement.Hospital_Management.entity;

import com.HealthManagement.Hospital_Management.Enum.BloodGroup;
import com.HealthManagement.Hospital_Management.Enum.Gender;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true)
    private String patientCode;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private  String lastName;

    @Column(nullable = true, length = 20)
    private String age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @Column(nullable = true,unique = true)
    private  String email;

    @Enumerated(EnumType.STRING)
    private BloodGroup bloodGroup;

    @Column(nullable = false, unique = true)
    private String aadharNumber;

    @Column(nullable = true)
    private String address;

    @Column(nullable = false)
    private String emergencyContact;

    @Column(nullable = false)
    private String admitDate;


}
