package com.company;

public class Worker {
    public static void appointDoctorToPatient(Patient patient, Doctor doctor, SickLeave sickLeave) {
        sickLeave.setPatientId(patient.getId());
        sickLeave.setDoctorId(doctor.getId());
    }



    public static void makeAppointmentToPatient(Patient patient, Doctor doctor, MedicalPurpose medicalPurpose) {
//        if(medicalPurposeType == 1) {
//            MedicalPurpose medicalPurpose = new MedicalMedicine();
//        } else if(medicalPurposeType == 2) {
//            MedicalPurpose medicalPurpose = new MedicalProcedure();
//        } else {
//            MedicalPurpose medicalPurpose = new MedicalOperation();
//        }
        if(doctor.getRole() == DoctorRole.NURSE && medicalPurpose.equals(new MedicalOperation(medicalPurpose.getId(), medicalPurpose.getTitle(), medicalPurpose.getDescription()))) {
            System.out.println("Ошибка");
        } else {
            medicalPurpose.setPatient(patient);
            medicalPurpose.setDoctor(doctor);
            medicalPurpose.setSickLeaveStatus(SickLeaveStatus.IN_PROGRESS);
        }
    }

}
