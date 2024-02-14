package lesson_from_school;

import java.io.File;
import java.util.Scanner;

import javax.swing.*;

public class DeleteAllFiles {
    public static void main(String[] args) {
        String path = "E://Test";
        File dir = new File(path);
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()){
                if (file.delete()) {
                    System.out.println("O'chirildi " + file.getName());
                }
            } else if (file.isDirectory()) {
                recursiveFile(file.getAbsolutePath());
            }
        }
    }
    public static void recursiveFile(String path){
        File file = new File(path);
        if (file.listFiles() == null) {
            return;
        }
        File[] files = file.listFiles();
        for (File dFile : files){
            if (dFile.isFile()){
                dFile.delete();
            } else {
                recursiveFile(dFile.getAbsolutePath());
            }
        }
    }


}
