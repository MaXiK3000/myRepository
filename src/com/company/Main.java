package com.company;

import com.company.reader.Reader;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    // TODO: read archive --> add one more sickLeave to archieve --> write archieve to file --> Run program
    // TODO: сделать метод назначить доктора пациенту
    // TODO: сделть метод сделать назначение пациенту (этот метод должен делать доктор)

    // TODO: сделать метод выполнить назначение, который принимает параметры 1.медсестра 2.назначение. Возвращает ошибку, если назначение == операция, иначе меняет статус у назначения в IN_PROGRESS
    // TODO: сделать метод окончания лечения, который принимает параметры 1.пациент 2.назначение. Меняет статус назначение на ENDED и переводит это все в архив
    public static void main(String[] args) {
        System.out.println("Начинаем работу! Привет пользователь. Подождите, идет инициализация архива");
//        SickLeave sickLeave1 = new SickLeave(new SimpleDateFormat("dd.MM.yyyy").parse("12.12.2021"), new SimpleDateFormat("dd.MM.yyyy").parse("23.12.2021"), 134, 432, "Shiza", procedure);
//        SickLeave sickLeave2 = new SickLeave(new SimpleDateFormat("dd.MM.yyyy").parse("03.10.2021"), new SimpleDateFormat("dd.MM.yyyy").parse("06.12.2021"), 658, 921, "Kashel", medicine);
//        SickLeave sickLeave3 = new SickLeave(new SimpleDateFormat("dd.MM.yyyy").parse("09.10.2021"), new SimpleDateFormat("dd.MM.yyyy").parse("14.11.2021"), 821, 305, "Spina", operation);
//        System.out.println(sickLeave1);
//        System.out.println(sickLeave2);
        Archive archive = new Archive();

//        Reader.readArchive(Paths.get("E://Java//Hospital//files//archive.txt"), archive);
        Reader.read("E://Java//Hospital//files//archive.csv", archive); // читаешь текущие даннные из файла
        System.out.println("Архив, загруженнный в память:");
        System.out.println(archive);// проверка что ты загрузил данные в память программы из файла


        SickLeave sickLeave = new SickLeave(new Date(), new Date(), 0, 0, "some diagnos", new MedicalMedicine(12, "medicine 1", "descr descr sf"));
        Doctor doctor = new Doctor(666, "Павел", "Григориевич", DoctorRole.THERAPIST);
        MedicalProcedure medicalProcedure = new MedicalProcedure(223, "описание какое то там", "че то там еще");
        Patient patient = new Patient(666, "Иван", "Дурачок", 35, PatientSex.MAN);
        Worker.appointDoctorToPatient(patient, doctor, sickLeave);
        Worker.makeAppointmentToPatient(patient, doctor, medicalProcedure);
        System.out.println("Добавляем новую запись в архив (память)");
        archive.add(sickLeave); // меняешь архивные данные, но не пишешь их в файл, они остаются в памяти. ТО есть если программа аварийно завершится, то данные будут потеряны, так как они не записались в файл, а остались в памяти программы, которая очистилась при звершении программы

        System.out.println("записыпаем новый архив в файл");
        Reader.write("E://Java//Hospital//files//archive.csv", archive); // чтобы данне из памяти программы жили и после ее завершения - мы записываем их в файл
//        archive.add(sickLeave1);
//        archive.add(sickLeave2);
//        archive.add(sickLeave3);
//        System.out.println(archive);
        System.out.println("Завершение программы");
    }
}
