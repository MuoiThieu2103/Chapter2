import java.lang.StringBuffer;

public class Bai2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append("World");
        System.out.println("After append:" +sb);

        sb.insert(5,",");
        System.out.println("After insert:" +sb);

        sb.delete(5,6);
        System.out.println("After delete:" +sb);

        sb.reverse();
        System.out.println("After reverse:" +sb);

        sb.reverse();
        sb.replace(6,11, "Java");
        System.out.println("After replace:" +sb);

        System.out.println("Capacity:" +sb.capacity());

        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50):" +sb.capacity());

        System.out.println("Length:" +sb.length());

        System.out.println("Character at index 6:" +sb.charAt(6));

        String subStr = sb.substring(6,10);
        System.out.println("Substring from index 6 to 10:" +subStr);
    }
}
