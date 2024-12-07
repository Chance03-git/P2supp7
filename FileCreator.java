import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
    /**
     * Creates a file with the specified filename, writes the given content to it, and saves the file.
     * 
     * @param filename The name of the file to create.
     * @param content  The content to write to the file.
     * @throws IOException If an I/O error occurs during file creation or writing.
     */
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
