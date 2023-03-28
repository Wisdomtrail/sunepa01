package chapterFifteen;

public class Person implements Human{

    private Person(){}

    public static Human get(){
        return new Person();
    }
}
