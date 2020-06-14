package com.example.hos.model;

import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Doctor {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long docId;

     private String docName;
     @OneToMany(targetEntity = Patient.class,cascade = CascadeType.ALL)
     @JoinColumn(name="dp_fk")
     private List<Patient> patients;


}
