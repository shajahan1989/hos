package com.example.hos.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Patient {

    private Long patientId;

    private String patientName;
    @ManyToOne
    private Doctor doctor;

}
