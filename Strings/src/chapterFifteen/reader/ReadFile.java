package chapterFifteen.reader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ReadFile {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\sunep\\IdeaProjects\\Strings\\src\\chapterFifteen\\gee.txt");) {
            byte[] bytes = fileInputStream.readAllBytes();
            System.out.println(Arrays.toString(bytes));
            for (Byte b : bytes) {
                System.out.print(Character.toString(b));
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
