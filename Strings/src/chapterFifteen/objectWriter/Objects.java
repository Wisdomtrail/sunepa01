package chapterFifteen.objectWriter;

import chapterFifteen.Dog;

import java.io.*;

public class Objects {
    public static void main(String[] args) {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("dog"))) {
            Dog aja = new Dog("bingo", 35);
            objectOutputStream.writeObject(aja);
        }
        catch (IOException | SecurityException e){
            e.printStackTrace();
        }
    }
}
