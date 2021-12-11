package com.company;

public class Worker {
    public static void appointDoctorToPatient(Doctor doctor, Patient patient, SickLeave sickLeave) {
        sickLeave.setPatientId(patient.getId());
        sickLeave.setDoctorId(doctor.getId());
    }

    public void makeAppointmentToPatient(Doctor doctor) {
        doctor.setMedicalPurpose(
    }
}
