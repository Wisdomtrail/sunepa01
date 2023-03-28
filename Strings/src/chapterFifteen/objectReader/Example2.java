package chapterFifteen.objectReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Example2 {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\sunep\\IdeaProjects\\Strings\\src\\chapterFifteen\\gee.txt"))){
            var dog = objectInputStream.readObject();
        } catch (IOException | SecurityException  | ClassNotFoundException exception){
            exception.printStackTrace();
        }
    }
}
