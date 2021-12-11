package com.company.converter;

import com.company.MedicalProcedure;
import com.company.MedicalPurpose;
import com.company.SickLeave;
import com.company.SickLeaveStatus;

import java.util.Date;

public class Converter {
    public Converter() {
    }

    public static SickLeave mapStringToSickLeave(String string) {
        String[] strings = string.split(","); // " " - это и есть разделитель. Ты можешь задать свой символ, либо использовать Regex.
        int id = Integer.parseInt(strings[0]);
        Date startDate = new Date(Long.parseLong(strings[1]));
        Date endDate = new Date(Long.parseLong(strings[2]));
        int patientId = Integer.parseInt(strings[3]);
        int doctorId = Integer.parseInt(strings[4]);
        SickLeaveStatus status = SickLeaveStatus.valueOf(strings[5]);
        String diagnosis = strings[6];
        //        if (strings[6].equals("MedicalOperation")) {
        //            // strings[7] strings[8] strings[9] - эт точно new MedicalOperation()
        //        } else if (strings[6].equals("MedicalPro"))
        MedicalProcedure medicalProcedure = new MedicalProcedure(1, "lulu", "lolo");
        // convert strings to SickLeave
        return new SickLeave(id, startDate, endDate, patientId, doctorId, status, diagnosis, medicalProcedure);
    }

    public static String mapSickLeaveToString(SickLeave sickLeave, String separator) {
        int id = sickLeave.getId();
        Date startDate = sickLeave.getStartDate();
        Date endDate = sickLeave.getEndDate();
        int patientId = sickLeave.getPatientId();
        int doctorId = sickLeave.getDoctorId();
        SickLeaveStatus status = sickLeave.getStatus();
        String diagnosis = sickLeave.getDiagnosis();
        MedicalPurpose medicalPurpose = sickLeave.getMedicalPurpose();
        return id + separator + startDate.getTime() + separator + endDate.getTime() + separator + patientId + separator + doctorId + separator + status + separator + diagnosis + separator + medicalPurpose;
    }

}
