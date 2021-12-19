package com.company;

public abstract class MedicalPurpose {
    private int id;
    private String title;
    private String description;
    private Doctor doctor;
    private Patient patient;
    private SickLeaveStatus sickLeaveStatus;
    public MedicalPurpose(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public SickLeaveStatus getSickLeaveStatus() {
        return sickLeaveStatus;
    }

    public void setSickLeaveStatus(SickLeaveStatus sickLeaveStatus) {
        this.sickLeaveStatus = sickLeaveStatus;
    }
}
