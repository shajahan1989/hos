package com.example.hos.Repository;

import com.example.hos.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {

    @Query("select d from Doctor d where d.docName =?1")
    List<Doctor> getAllDocByFirstName(String docName);

}
