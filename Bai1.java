import java.lang.Character;

public class Bai1 {
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

        System.out.println("toLowerCase('A'): " + Character.toLowerCase(char1));

        System.out.println("isWhitespace(' '): " + Character.isWhitespace(char4));

        System.out.println("getNumericValue('1'): " + Character.getNumericValue(char3));

        System.out.println("isLetterOrDigit('A'): " + Character.isLetterOrDigit(char1));

        System.out.println("isLetterOrDigit('1'): " + Character.isLetterOrDigit(char3));

        System.out.println("charCount('Kappa'): " + Character.charCount(char5));
    }
}
