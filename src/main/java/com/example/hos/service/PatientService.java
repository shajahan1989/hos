package com.example.hos.service;

import com.example.hos.Repository.PatientRepository;
import com.example.hos.model.Patient;
import com.example.hos.model.PatientType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;


    public void addPatient(Patient patient){
        patientRepository.save(patient);
    }

    public List<Patient> listAllPatients(){
         return patientRepository.findAll();
    }

    public List<Patient>findByPatientType(PatientType patientType){
       return patientRepository.findByPatientType(patientType);
    }
}
