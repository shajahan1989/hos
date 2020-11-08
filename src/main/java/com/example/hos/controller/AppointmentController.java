package com.example.hos.controller;

import com.example.hos.model.Appointment;
import com.example.hos.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class AppointmentController {

    private  Appointment appointment ;

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/getAppointment")
    public void getAppointment(@RequestBody Appointment appointment){
        appointmentService.getAppointment(appointment);

    }

    @GetMapping("/listAppointment")
    public List<Appointment>listAllAppointment(){

        return appointmentService.listAppointment();
    }


    @PutMapping("/cancelappointment/{mobileNumber}")
        public void CancelAppointment (@PathVariable(value="mobileNumber") String mobileNumber,@RequestBody Appointment appointment){
          Appointment app =appointmentService.CancelAppointment(mobileNumber);
            appointmentService.saveCancelAppointment(app);
        }
    }