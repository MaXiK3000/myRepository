package com.company;

public abstract class MedicalPurpose {
    int id;
    String title;
    String description;
    public MedicalPurpose(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

}
