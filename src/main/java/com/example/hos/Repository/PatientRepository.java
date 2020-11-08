package com.example.hos.Repository;

import com.example.hos.model.Patient;
import com.example.hos.model.PatientType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository  extends JpaRepository<Patient,Long> {

    List<Patient> findByPatientName(String docName);

    List<Patient>findByPatientType(PatientType patientType);
}
