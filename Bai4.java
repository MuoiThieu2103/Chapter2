import java.lang.Character;
import java.util.Random;

public class Bai4 {
    public static void main(String[] args) {
        char char1 = 'A';
        char char2 = 'a';
        char char3 = '1';
        char char4 = ' ';
        char char5 = '\u039A';
        System.out.println("isDigit('1'): " + Character.isDigit(char3));

        System.out.println("isLetter('A'): " + Character.isLetter(char1));

        System.out.println("isUpperCase('A'): " + Character.isUpperCase(char1));

        System.out.println("isLowerCase('a'): " + Character.isLowerCase(char2));

        System.out.println("toUpperCase('a'): " + Character.toUpperCase(char2));

        Random random = new Random();
        System.out.println(random.nextInt(10));
        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());
        System.out.println(random.nextFloat());
        System.out.println(random.nextGaussian());
    }
}
