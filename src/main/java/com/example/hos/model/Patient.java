package com.example.hos.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Patient {
    @Id
    private Long patientId;

    private String patientName;


}
