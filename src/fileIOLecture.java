import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class fileIOLecture {
    public static void main(String[] args) {

        String directory = "dataIO";
        String filename = "info.text";

        Path dataDirectory = Paths.get(directory);
        System.out.println(dataDirectory.toAbsolutePath());
        Path dataFile = Paths.get(directory, filename);

        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
                System.out.println("Directory created");
            }
//            if (!Files.exists(dataFile)) {
//                Files.createFile(dataDirectory);
//                System.out.println("created Directory");
//            }
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
//        writeFile();
        readWriteFile();
    }

    static void writeFile(){
        List<String> fruit= new ArrayList<>();
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("peach");
        fruit.add("pineapple");

        for(String fr: fruit){
            System.out.println(fr);
        }

        try{
            Path groceries = Paths.get("dataIO", "groceries.txt");
            Files.write(groceries, fruit);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    static void readWriteFile(){
        List<String> fruit = null;

        try{
            Path groceries = Paths.get("dataIO", "groceries.txt");
            fruit = Files.readAllLines(groceries);
            for(String line: fruit){
                System.out.println(line);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        fruit.add("strawberry");
        fruit.add("kiwi");
        fruit.add("apple");
//        fruit.add("pineapple");

        try{
            Path groceries = Paths.get("dataIO", "groceries.txt");
            Files.write(groceries, fruit);
//            Files.write(groceries, fruit, StandardOpenOption.APPEND);
            for(String line: fruit){
                System.out.println(line);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
