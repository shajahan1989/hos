package com.example.hos.controller;

import com.example.hos.model.Doctor;
import com.example.hos.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/doctors")
    public List<Doctor> getAllDoctor(){
        return doctorService.getAllDoctor();
    }
    @PostMapping("/addDoctor")
    public void addDoctor(@RequestBody Doctor doctor){
        doctorService.addDoctor(doctor);
    }

    @GetMapping("/ByDocName/{docName}")
    public List<Doctor> getAllDocByFirstName(@PathVariable String docName){
        return doctorService.getAllDocByFirstName(docName);
    }



}
