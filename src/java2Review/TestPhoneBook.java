package java2Review;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPhoneBook {
    public static void main(String[] args) {
        Path phoneBookDir = Paths.get("BookDir");
        Path phoneBookFile = Paths.get(phoneBookDir.toString(), "phonebook.txt"); //need to use phoneBookDir first so that the file goes in the right directory

        if(Files.notExists(phoneBookDir)){
            try{
                Files.createDirectories(phoneBookDir);
            } catch (IOException ioe){
                ioe.printStackTrace();
            }
        }
        if(Files.notExists(phoneBookFile)){
            try{
                Files.createFile(phoneBookFile);
            } catch(IOException ioe){
                ioe.printStackTrace();
            }
        }

        try{
            Files.writeString(phoneBookFile, "First Name, Last Name");
        } catch(IOException ioe){
            ioe.printStackTrace();
        }
        List<String> readLines = new ArrayList<>();
        try{
            readLines = Files.readAllLines(phoneBookFile);
        } catch(IOException ioe){
            ioe.printStackTrace();
        };
        System.out.println(readLines.get(0));

        //how to parse/split the arrayList
        String[] personDetails = readLines.get(0).split(", ");
        System.out.println(Arrays.toString(readLines.get(0).split(",")));
        for (String item : personDetails){
            System.out.println(item);
        }
    }
}
