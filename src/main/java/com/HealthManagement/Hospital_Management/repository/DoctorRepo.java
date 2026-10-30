package com.HealthManagement.Hospital_Management.repository;

import com.HealthManagement.Hospital_Management.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Long> {

    Optional<Doctor> findByDoctorCode(String doctorCode);

    Optional<Doctor> findByEmail(String email);

    Optional<Doctor> findByPhoneNumber(String phoneNumber);
}
