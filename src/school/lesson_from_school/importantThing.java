package lesson_from_school;

import java.io.File;

public class importantThing {
    public static void main(String[] args) {
        // Read folders and files
        File file = new File("E:");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getName());
        }
//        Delete Thinks
    File dFile = new File("E://Test");
    if (dFile.delete()){
        System.out.println("O`chirildi");
    }else {
        System.out.println("Topilmadi");
    }
    }
}

