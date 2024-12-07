import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderUtility {
    /**
     * Reads the content of a file and returns it as a string.
     * 
     * @param filename The name of the file to read.
     * @return A string containing the content of the file.
     * @throws IOException If an I/O error occurs during file reading.
     */
    public static String readFileAsString(String filename) throws IOException {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        }

        return content.toString().trim(); // Trim trailing newline for cleaner output
    }
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
