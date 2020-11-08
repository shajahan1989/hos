package com.example.hos.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Patient {
    @Id
    private Long patientId;

    private String patientName;

    @Enumerated(EnumType.STRING)
    private PatientType patientType;

    public PatientType getPatientType() {
        return patientType;
    }

    public void setPatientType(PatientType patientType) {
        this.patientType = patientType;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
}
