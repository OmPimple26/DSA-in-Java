// File Handling:

// Streams: Sequence of data -> 1) byte  2) character(unicode)
// Streams are the abstraction that Java provides
// Java implements streams within class hierarchies in java.io package

// Types of Streams in Java:

// 1) Byte Stream:
// i) e.g. Reading or writing into file, open an image in a text editor, scanning pdf, etc;
// ii) It is defined with the help of two classes: Input Stream and Output Stream

// 2) Character Stream:
// i) e.g. Used for unicode characters
// ii) It is defined with the help of two classes: Reader and Writer

// IO Exception: Corrupt file, not able to read, file not found, etc.

// Predefined Streams:
// i) System.out => Standard Output Stream => console
// i) System.in => Standard Input Stream => keyboard
// i) System.err => Standard Error => console

// System.in is an object of type InputStream; System.out and System.err are objects of type PrintStream. These are byte streams.

// Scanner in Java is a helper tool (a built-in class) that takes raw data coming from System.in and translates it into easy-to-use types like numbers, words, or full lines of text.


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        // Create file
        try {
            File fo = new File("FileHandling/new-file.txt");
            fo.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Write in the file
        try {
            FileWriter fw = new FileWriter("FileHandling/new-file.txt");
            fw.write("सर्वधर्मान्परित्यज्य मामेकं शरणं व्रज, अहं त्वां सर्वपापेभ्यो मोक्षयिष्यामि मा शुच:");
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}