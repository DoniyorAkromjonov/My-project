package lesson_from_school;

import java.io.*;

public class fileCreater {
    public static void main(String[] args) {
        File file = new File("E://Test.txt");

        try {
            if (file.createNewFile()){
                System.out.println("Fayl yaratildi" + file.getName());
            }else {
                System.out.println("Fayl allaqachon mavjud");
            }

            FileWriter writer = new FileWriter(file);
            writer.write("Salom, Qalaysan???!!!");
            writer.close();

            FileReader reader = new FileReader("E://Test.txt");
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
