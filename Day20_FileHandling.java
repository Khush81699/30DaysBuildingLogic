import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Day20_FileHandling {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Learning Java File Handling\n");
            writer.write("This is Day 20 practice.");
            writer.close();

            FileReader reader = new FileReader("sample.txt");
            int data;

            System.out.println("File Content:");

            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}