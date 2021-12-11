package com.company;

import java.text.DateFormat;
import java.util.Date;

public class SickLeave {
    int id;
    Date startDate;
    Date endDate;
    int patientId;
    int doctorId;
    SickLeaveStatus status;
    String diagnosis;
    MedicalPurpose medicalPurpose;

    public SickLeave(Date startDate, Date endDate, int patientId, int doctorId, String diagnosis, MedicalPurpose medicalPurpose) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = this.mapDateToStatus(startDate, endDate);
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.diagnosis = diagnosis;
        this.medicalPurpose = medicalPurpose;

        this.id = (int) (Math.random() * 50 + 1);
    }

    public SickLeave(int id, Date startDate, Date endDate, int patientId, int doctorId, SickLeaveStatus status, String diagnosis, MedicalPurpose medicalPurpose) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.diagnosis = diagnosis;
        this.medicalPurpose = medicalPurpose;
    }

    @Override
    public String toString() {
        return id + " " + startDate.getTime() + " " + endDate.getTime() + " " + patientId + " " + doctorId + " " + status + " " + diagnosis + " " + medicalPurpose;
//        long time = 1639256400000L;
//        Date date = new Date(time);
//        return id + " " + diagnosis;
    }

    public String mapSickLeaveToString(String separator) {
        return id + separator + startDate.getTime() + separator + endDate.getTime() + " " + patientId + " " + doctorId + " " + status + " " + diagnosis + " " + medicalPurpose;
    }

    public int getId() {
        return id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getPatientId() {
        return patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setMedicalPurpose(MedicalPurpose medicalPurpose) {
        this.medicalPurpose = medicalPurpose;
    }

    public SickLeaveStatus getStatus() {
        return status;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public MedicalPurpose getMedicalPurpose() {
        return medicalPurpose;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    private SickLeaveStatus mapDateToStatus(Date startDate, Date endDate) {
        Date now = new Date();

        if (startDate.equals(now) || startDate.before(now) && endDate.after(now)) {
            return SickLeaveStatus.IN_PROGRESS;
        } else if (endDate.equals(now) || endDate.before(now)) {
            return SickLeaveStatus.ENDED;
        } else {
            return SickLeaveStatus.NOT_STARTED;
        }
    }

}
