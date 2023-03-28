package chapterFifteen;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;

public class Example1 {
    public static void main(String[] args) {
//        Path path = Paths.get("a:/b/c/");
//        System.out.println("fileName: "+path.getFileName());
//        System.out.println("fileSystem: "+path.getFileSystem());
//        System.out.println("normalPath: " + path.normalize());
//        System.out.println("root: " + path.getRoot());
//        System.out.println("path: "+path );
//        Path path1 = Paths.get("b/c");
//        System.out.println(path.endsWith(path1));


        Path path = Path.of("C:\\Users\\sunep\\IdeaProjects\\Strings\\src\\chapterFifteen\\Class.java");
        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
            Iterator<Path> pathIterator = directoryStream.iterator();
            while(pathIterator.hasNext()){
                Path path1 = pathIterator.next();
                System.out.println(path1.getFileName());
                directoryStream.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
