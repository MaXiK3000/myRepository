package com.company;

import com.company.converter.Converter;

import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;

public class Archive {
    private ArrayList<SickLeave> sickList;

    public Archive() {
        this.sickList = new ArrayList<>();
    }

    public Archive(ArrayList<SickLeave> sickList) {
        this.sickList = sickList;
    }

    public boolean add(SickLeave sickLeave) {
        return this.sickList.add(sickLeave);
    }

    public ArrayList<SickLeave> getSickList() {
        return sickList;
    }

    public boolean add(String string) {
        SickLeave sickLeave = Converter.mapStringToSickLeave(string);

        return this.add(sickLeave);
    }

    void pop() {

    }

    void remove() {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (SickLeave sick: sickList) {
            sb.append(sick);
            sb.append("\n");
        }
        return sb.toString();
    }

//    @Override
//    public String toString() {
//        return sickList.stream().map(Object::toString).collect(Collectors.joining(", \n"));
//
//    }
}
