package com.HealthManagement.Hospital_Management.dto;

import com.HealthManagement.Hospital_Management.Enum.BloodGroup;
import com.HealthManagement.Hospital_Management.Enum.Gender;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor



public class patientRequest {

    @NotBlank(message = "required")
    private String patientCode;

    @NotBlank(message = "Name is required")
    private String firstName;

    @NotBlank(message = "required")
    private String lastName;

    @NotNull(message = "age is required")
    private String age;

    @NotNull (message = "gender is required")
    private Gender gender;

    @Pattern(regexp = "^[6_9]\\d{9}", message = "invalid phoneNumber")
    private String phoneNumber;

    @Email(message = "invalide mail format")
    private String email;

    @NotNull(message = "required")
    private BloodGroup bloodGroup;

    @NotNull(message = "required")
    private String aadharNumber;

    @NotNull(message = "required")
    private String address;

    @NotNull(message = "required")
    private String emergencyContact;

    @NotNull(message = "required")
    private String admitDate;

    @NotNull(message = "required")
    private String status;

}
