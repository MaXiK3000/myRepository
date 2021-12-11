package com.company.reader;

import com.company.Archive;
import com.company.SickLeave;
import com.company.converter.Converter;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Reader {
    public static void readArchive(Path path, Archive archive) throws IOException {
        if (Files.exists(path)){
            try (Stream<String> line = Files.lines(path, Charset.defaultCharset())) {
                line.forEach(archive::add);
            }
        }
    }

    public static void read(String filename, Archive archive) {
        File file = new File(filename);
        System.out.println("Пытаюсь открыть архив по пути " + filename);
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String string;
            System.out.println("Архив найден, выполняется чтение архива");
            while ((string = br.readLine()) != null) {
                archive.add(string); // добавляет строку sickLeave как экземплят класса SickLeave в Архив
            }
            System.out.println("Чтение архива завершено");
        } catch (FileNotFoundException e) {
            System.err.println("File \"" + filename + "\" not found");
        } catch (IOException e) {
            System.err.println("IOException while reading \"" + filename + "\"");
        }
    }

    public static void write(String filename, Archive archive) {
        File file = new File(filename);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            ArrayList<SickLeave> list = new ArrayList<>(archive.getSickList());
            for (SickLeave sickLeave : list) {
                bw.write(Converter.mapSickLeaveToString(sickLeave, ","));
                bw.write("\n");
            }
            bw.flush();
        } catch (FileNotFoundException e) {
            System.err.println("File \"" + filename + "\" not found");
        } catch (IOException e) {
            System.err.println("IOException while writing in \"" + filename + "\"");
        }
    }
}
