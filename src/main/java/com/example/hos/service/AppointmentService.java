package com.example.hos.service;

import com.example.hos.Repository.AppointmentRepository;
import com.example.hos.model.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;

    public void getAppointment(Appointment appointment){
        appointmentRepository.save(appointment);
    }

    public List<Appointment>listAppointment(){
        return appointmentRepository.findAll();
    }

    public Appointment CancelAppointment(String mobileNumber){
      Appointment cancelappointment = appointmentRepository.findByMobileNumber(mobileNumber);
        if(cancelappointment.getMobileNumber().equals(mobileNumber)){
             cancelappointment.setActive(false);
        } else {
            cancelappointment.setActive(true);
        }
         return cancelappointment;

    }

     public void saveCancelAppointment(Appointment appointment){
         appointmentRepository.save(appointment);
     }



}
