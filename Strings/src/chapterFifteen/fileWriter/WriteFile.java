package chapterFifteen.fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("C:\\Users\\sunep\\IdeaProjects\\Strings\\src\\chapterFifteen\\gee.txt")) {
            fileWriter.append("thank God its friday");
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
