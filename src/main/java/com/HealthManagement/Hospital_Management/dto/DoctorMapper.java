package com.HealthManagement.Hospital_Management.dto;

import com.HealthManagement.Hospital_Management.dto.DoctorRequest;
import com.HealthManagement.Hospital_Management.entity.Doctor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface DoctorMapper {

        Doctor toEntity(DoctorRequest request);

        DoctorRequest toRequest(Doctor doctor);
    }

