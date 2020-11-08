package com.example.hos.Repository;

import com.example.hos.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Long> {

    Appointment findByMobileNumber(String mobileNumber);

}
