package com.company;

public class MedicalProcedure extends MedicalPurpose {
    public MedicalProcedure(int id, String title, String description) {
        super(id, title, description);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + this.id + " " + this.title + " " + this.description;
    }
}
