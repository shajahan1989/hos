package com.example.hos.model;

import lombok.Data;
import lombok.ToString;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.List;

@Entity
@Data

public class Doctor {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long docId;

     private String docName;
     @OneToMany(targetEntity = Patient.class,cascade = CascadeType.ALL)
     @JoinColumn(name="dp_fk",referencedColumnName = "docId")
     private List<Patient> patients;

     public Long getDocId() {
          return docId;
     }

     public void setDocId(Long docId) {
          this.docId = docId;
     }

     public String getDocName() {
          return docName;
     }

     public void setDocName(String docName) {
          this.docName = docName;
     }

     public List<Patient> getPatients() {
          return patients;
     }

     public void setPatients(List<Patient> patients) {
          this.patients = patients;
     }

     @Override
     public String toString() {
          return "Doctor{" +
                  "docId=" + docId +
                  ", docName='" + docName + '\'' +
                  ", patients=" + patients +
                  '}';
     }
}
