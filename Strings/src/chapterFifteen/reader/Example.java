package chapterFifteen.reader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        char[] chars = new char[1024];
        try (FileReader fileReader = new FileReader("C:\\Users\\sunep\\IdeaProjects\\Strings\\src\\chapterFifteen\\gee.txt")){
           var numberOfCharacters =  fileReader.read(chars);
           System.out.println(numberOfCharacters);
            System.out.println(Arrays.toString(chars));
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
