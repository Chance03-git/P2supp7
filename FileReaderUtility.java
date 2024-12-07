import java.io.IOException;

public class FileReaderUtility {
    public static void main(String[] args) {
        String filename = "example.txt"; // Name of the file to read

        try {
            // Read the content of the file
            String fileContent = readFileAsString(filename);
            System.out.println("Content of the file:\n" + fileContent);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
