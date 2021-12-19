package com.company;

public class Doctor {
    private int id;
    private String firstName;
    private String lastName;
    private DoctorRole role;

    public Doctor(int id, String firstName, String lastName, DoctorRole role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPatientId(Patient patient) {
        patient.id = patient.getId();
    }

//    public MedicalPurpose getMedicalPurpose(MedicalPurpose medicalPurpose) {
//        if (medicalPurpose.equals(new MedicalMedicine(medicalPurpose.id, medicalPurpose.title, medicalPurpose.description))) {
//            return new MedicalMedicine(medicalPurpose.id, medicalPurpose.title, medicalPurpose.description);
//        } else if (medicalPurpose.equals(new MedicalProcedure(medicalPurpose.id, medicalPurpose.title, medicalPurpose.description))) {
//            return new MedicalProcedure(medicalPurpose.id, medicalPurpose.title, medicalPurpose.description);
//        } else if (medicalPurpose.equals(new MedicalOperation(medicalPurpose.id, medicalPurpose.title, medicalPurpose.description))) {
//            return new MedicalOperation(medicalPurpose.id, medicalPurpose.title, medicalPurpose.description);
//        }
//        return medicalPurpose;
//    }



    public void setPatientFirstName(Patient patient) {
        patient.firstName = patient.getFirstName();
    }

    public void setPatientLastName(Patient patient) {
        patient.id = patient.getId();
    }

    public void setPatientAge(Patient patient) {
        patient.age = patient.getAge();
    }

//    public void setPatientSex(Patient patient) {
//        patient.sex = patient.getSex();
//    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public DoctorRole getRole() {
        return this.role;
    }

    public void setRole(DoctorRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role=" + role +
                '}';
    }
}
