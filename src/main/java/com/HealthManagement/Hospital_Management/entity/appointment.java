package com.HealthManagement.Hospital_Management.entity;

import com.HealthManagement.Hospital_Management.Enum.appointmentstatus;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "appointments")

public class appointment {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false, unique = true)
        private String appointmentCode;

        @ManyToOne
        @JoinColumn(name = "patient_id", nullable = false)
        private patient patient;

        @ManyToOne
        @JoinColumn(name = "doctor_id", nullable = false)
        private Doctor doctor;

        @Column(nullable = false)
        private LocalDate appointmentDate;

        @Column(nullable = false)
        private LocalTime appointmentTime;

        @Column(nullable = false, length = 500)
        private String reason;

        @Enumerated(EnumType.STRING)
        @Column(nullable = false)
        private appointmentstatus status;

        @Column(length = 1000)
        private String notes;

        // Default Constructor
        public appointment() {
        }

        // Getters and Setters

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getAppointmentCode() {
            return appointmentCode;
        }

        public void setAppointmentCode(String appointmentCode) {
            this.appointmentCode = appointmentCode;
        }

        public patient getPatient() {
            return patient;
        }

        public void setPatient(patient patient) {
            this.patient = patient;
        }

        public Doctor getDoctor() {
            return doctor;
        }

        public void setDoctor(Doctor doctor) {
            this.doctor = doctor;
        }

        public LocalDate getAppointmentDate() {
            return appointmentDate;
        }

        public void setAppointmentDate(LocalDate appointmentDate) {
            this.appointmentDate = appointmentDate;
        }

        public LocalTime getAppointmentTime() {
            return appointmentTime;
        }

        public void setAppointmentTime(LocalTime appointmentTime) {
            this.appointmentTime = appointmentTime;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public appointmentstatus getStatus() {
            return status;
        }

        public void setStatus(appointmentstatus status) {
            this.status = status;
        }

        public String getNotes() {
            return notes;
        }

        public void setNotes(String notes) {
            this.notes = notes;
        }
    }

