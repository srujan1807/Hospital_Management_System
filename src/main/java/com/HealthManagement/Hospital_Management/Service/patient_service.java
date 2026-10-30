package com.HealthManagement.Hospital_Management.Service;

import com.HealthManagement.Hospital_Management.dto.patientMapper;
import com.HealthManagement.Hospital_Management.dto.patientRequest;
import com.HealthManagement.Hospital_Management.entity.patient;
import com.HealthManagement.Hospital_Management.repository.patientRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class patient_service {

    private final patientRepo re;
    private final patientMapper mapper;

    public patientRequest add(patientRequest req) {

        if (re.findByPatientCode(req.getPatientCode()).isPresent()) {
            throw new RuntimeException("Patient code already exists");
        }

        if (re.findByEmail(req.getEmail()).isPresent()) {
            throw new RuntimeException("Patient email already exists");
        }

        patient pat = mapper.toEntity(req);

        patient savedPatient = re.save(pat);

        return mapper.toResponse(savedPatient);
    }
}
