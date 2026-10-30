package com.HealthManagement.Hospital_Management.repository;

import com.HealthManagement.Hospital_Management.entity.patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface patientRepo extends JpaRepository<patient, Long> {

    Optional<patient> findByPatientCode(String patientCode);

    Optional<patient> findByEmail(String email);
}