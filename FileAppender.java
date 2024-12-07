import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileAppender {
    /**
     * Appends the given content to a file with the specified filename.
     * If the file does not exist, it will be created.
     * 
     * @param filename The name of the file to append to.
     * @param content  The content to append to the file.
     * @throws IOException If an I/O error occurs during file writing.
     */ 
    public static void appendToFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(content);
            writer.newLine(); // Add a newline after appending the content
        }
    }
    public static void main(String[] args) {
        String filename = "example.txt"; // File to append to
        String content = "This is additional content."; // Content to append

        try {
            // Append content to the file
            appendToFile(filename, content);
            System.out.println("Content appended successfully to '" + filename + "'.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
