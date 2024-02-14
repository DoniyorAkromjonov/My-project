package lesson_from_school;

import java.io.*;
import java.time.LocalDate;

public class Class {
    public static void main(String[] args) {
        File file = new File("E://Test.txt");
        LocalDate date = LocalDate.now();

        try {
            if (file.createNewFile()){
                System.out.println("Fayl yaratildi" + file.getName());
            }else {
                System.out.println("Fayl allaqachon mavjud");
            }

            FileWriter writer = new FileWriter(file);
            writer.write("Mening yaxshi ko`rgan hayvonim bu It!");
            writer.write("Bugun: " + date);
            writer.write(" Faylning nomi: " + file.getName());
            writer.close();

            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

        }catch (IOException e) {
            System.out.println("Xatolik yuz berdi");
            throw new RuntimeException(e);
        }
    }
}
