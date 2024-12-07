import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {

    public static void createAndWriteFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
        }
    }

    public static void main(String[] args) {
        String filename = "example.txt"; // Name of the file to create
        String content = "This is the content of the file."; // Content to write to the file

        try {
            // Create the file and write content to it
            createAndWriteFile(filename, content);
            System.out.println("File '" + filename + "' created and saved successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
