package com.example.hos.service;

import com.example.hos.Repository.DoctorRepository;
import com.example.hos.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;


  public   List<Doctor> getAllDoctor(){
         return doctorRepository.findAll();

    }

     public  void addDoctor( Doctor doctor){
         doctorRepository.save(doctor);
     }


    public  List<Doctor> getAllDocByFirstName(String docName){
      return doctorRepository.getAllDocByFirstName(docName);
    }


}
