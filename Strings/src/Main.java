import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//         String s1 = "Hello";
//        String s2 = new String("Hello");
//
//        if (s1.equals(s2)) {
//            System.out.println("The strings are equal.");
//        } else {
//            System.out.println("The strings are not equal.");
//        }

        String userInput = "email@gmail.com";
        String regex = "[a-z]+@[a-z]+\\.[a-z]{2,}$";

        StringBuilder buffer1 = new StringBuilder(0);
        buffer1.append(19987654);
        System.out.println(buffer1.capacity());
        System.out.println(buffer1.charAt(1));
        System.out.println(buffer1.charAt(4));
        buffer1.insert(1,"gg");
        System.out.println(buffer1.charAt(1));
        buffer1.deleteCharAt(1);
        System.out.println(buffer1.charAt(1));
        char h = buffer1.charAt(0);
        System.out.println(Character.isDefined(h));
        System.out.println(Character.isJavaIdentifierPart(h));
        System.out.println(Character.isLetter(h));
        System.out.println(Character.isLetterOrDigit(h));
        System.out.println(Pattern.matches(regex,"j"));
        System.out.println(Pattern.compile("[a-z]+@[a-z]+\\.[a-z]{2,}$"));
        System.out.println(Pattern.matches(regex,userInput));
        String date = "dd/MM/yyyy";
        String password = "Password98@.";
        String regex1 = "[A-Z]+[a-z]+[0-9]+@+\\.";
        System.out.println(Pattern.matches(regex1,password));

    }
}