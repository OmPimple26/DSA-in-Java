import java.io.*;

public class Output1 {
    public static void output() {
        // Output
        OutputStream os = System.out;
        // os.write(😍); // Range is exceeded

        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
            osw.write("Hello World");
            osw.write(97);
            osw.write(10);
            osw.write('A');
            osw.write('\n');
            char[] arr = "hello world".toCharArray();
            osw.write(arr);
            // osw.write(😍);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileWriter fw = new FileWriter("FileHandling/note.txt", true)) {
            fw.write("This should be appended");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("FileHandling/note.txt"))) {
            bw.write("Hare Krishna 1");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Create
        try {
            File fo = new File("FileHandling/random.txt");
            fo.createNewFile();
            if(fo.delete()) {
                System.out.println(fo.getName());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Output1.output();
    }
}