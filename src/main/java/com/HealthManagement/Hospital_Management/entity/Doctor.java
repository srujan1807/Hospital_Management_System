package com.HealthManagement.Hospital_Management.entity;
import com.HealthManagement.Hospital_Management.Enum.Gender;
import jakarta.persistence.*;

@Entity
@Table(name = "doctors")

public class Doctor {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false, unique = true)
        private String doctorCode;

        @Column(nullable = false)
        private String firstName;

        @Column(nullable = false)
        private String lastName;

        @Enumerated(EnumType.STRING)
        private Gender gender;

        @Column(nullable = false)
        private String specialization;

        @Column(nullable = false)
        private String qualification;

        @Column(nullable = false)
        private Integer experience;

        @Column(nullable = false, unique = true)
        private String phoneNumber;

        @Column(nullable = false, unique = true)
        private String email;

        @Column(nullable = false)
        private String address;

        @Column(nullable = false)
        private String joiningDate;

        @Column(nullable = false)
        private Double consultationFee;


    }

