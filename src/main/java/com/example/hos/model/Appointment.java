package com.example.hos.model;

import javax.persistence.*;

import java.util.Date;

@Entity
public class Appointment {
    @Id
    private int appointmentNo;

    @Temporal(TemporalType.DATE)
    private Date date;

    private String mobileNumber;

    private String patientName;

    private String doctorName;

    @Column(name="is_active")
    private Boolean active;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public int getAppointmentNo() {
        return appointmentNo;
    }

    public void setAppointmentNo(int appointmentNo) {
        this.appointmentNo = appointmentNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentNo=" + appointmentNo +
                ", date=" + date +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", patientName='" + patientName + '\'' +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }
}
