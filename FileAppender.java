import java.io.IOException;

public class FileAppender {
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
