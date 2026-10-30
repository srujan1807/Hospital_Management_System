package com.HealthManagement.Hospital_Management.dto;

import com.HealthManagement.Hospital_Management.entity.patient;
import org.mapstruct.Mapper;
import org.mapstruct.Builder;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))

public interface patientMapper {
    patient toEntity(patientRequest pt);
    patientRequest toResponse(patient s);

    void updatepatientfrorequest(patientRequest req,@MappingTarget patient pt);
}
