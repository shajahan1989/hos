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

    @GetMapping("/hello")
   public String helloworld(){
       return "HELLO HOSPITAL1";
   }

}
