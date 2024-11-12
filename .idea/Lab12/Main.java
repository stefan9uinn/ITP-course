import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("input.txt"); FileOutputStream out = new FileOutputStream("output.txt")) {
            byte[] buffer = new byte[in.available()];
            in.read(buffer, 0, buffer.length);
            out.write(buffer);
            System.out.println("File copied successfully.");
        } catch (FileNotFoundException e) {
            System.err.println("Error: Input file 'input.txt' not found.");
        } catch (IOException e) {
            System.err.println("Error: Could not write to output file 'output.txt'. Check permissions.");
        }
    }
}