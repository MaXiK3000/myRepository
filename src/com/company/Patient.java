package com.company;

public class Patient{
    int id;
    String firstName;
    String lastName;
    int age;
    PatientSex sex;

    public Patient(int id, String firstName, String lastName, int age,PatientSex sex) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PatientSex getSex() {
        return sex;
    }

    public void setSex(PatientSex sex) {
        this.sex = sex;
    }
}
