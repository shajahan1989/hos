package com.example.hos.Repository;

import com.example.hos.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository  extends JpaRepository<Patient,Long> {

    List<Patient> findByPatientName(String docName);
}
