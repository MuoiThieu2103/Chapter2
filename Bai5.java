import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        double age,t,v,a,tbc;
        Scanner h = new Scanner(System.in);
        Scanner k = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = h.nextLine();
        System.out.print("Enter age: ");
        age = h.nextDouble();
        System.out.print("Enter address: ");
        String address = k.nextLine();
        System.out.print("Enter marks of Maths: ");
        t = h.nextDouble();
        System.out.print("Enter of Literature : ");
        v = h.nextDouble();
        System.out.print("Enter of English : ");
        a = h.nextDouble();
        tbc = (t+v+a)/3;
        System.out.print("Average mark of student: "+(double)tbc);
    }
}
