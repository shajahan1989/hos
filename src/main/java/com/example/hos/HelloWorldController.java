package com.example.hos;

import com.example.hos.model.Doctor;
import com.example.hos.model.Patient;
import com.example.hos.service.DoctorService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class HelloWorldController {




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
    @GetMapping("/ByName/{docName}")
     public Doctor getDocByName(@PathVariable String docName){
        return doctorService.findByDocName(docName);

     }

     @GetMapping("/ByPatient/{docName}")
       public List<Patient>getPatientByDocName(@PathVariable String docName){
           return doctorService.findPatientByDocName(docName);
       }


}
