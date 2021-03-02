package com.example.traininingclass;

public class Patient {

    public String patientName;
    public Integer patientAge;


    public Patient(String patientName, Integer patientAge) {
        this.patientName = patientName;
        this.patientAge = patientAge;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Integer getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(Integer patientAge) {
        this.patientAge = patientAge;
    }


    public void  getPatientDetails(){
        System.out.println("Patient Name : " + patientName);
        System.out.println("Patient Age : " + patientAge);

    }

}

