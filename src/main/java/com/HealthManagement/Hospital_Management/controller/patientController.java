package com.HealthManagement.Hospital_Management.controller;

import com.HealthManagement.Hospital_Management.Service.patient_service;
import com.HealthManagement.Hospital_Management.dto.patientRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class patientController {

    private final patient_service service;

    @PostMapping("/add")
    public patientRequest addPatient(
            @RequestBody patientRequest request) {

        return service.add(request);
    }
}