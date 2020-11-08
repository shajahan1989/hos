package com.example.hos.controller;

import com.example.hos.model.Doctor;
import com.example.hos.model.Patient;
import com.example.hos.model.PatientType;
import com.example.hos.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping("/patients")
    public List<Patient> listAllPatients(){
        return patientService.listAllPatients();
    }
    @PostMapping("/addPatient")
    public void addDoctor(@RequestBody Patient patient){
        patientService.addPatient(patient);
    }
    @GetMapping("/IPD")
    public List<Patient>IPD(){
        return patientService.findByPatientType(PatientType.INPATIENT);
    }


}
