import java.util.Scanner;
public class Bai6 {
        public static void main(String[] args) {
            double age, cost, income, benefit;
            Scanner h = new Scanner(System.in);
            Scanner k = new Scanner(System.in);
            System.out.println("Enter name:");
            String name = h.nextLine();
            System.out.println("Enter age:");
            age = h.nextDouble();
            System.out.println("Enter address:");
            String address = k.nextLine();
            System.out.println("Enter cost:");
            cost = h.nextDouble();
            System.out.println("Enter income:");
            income = h.nextDouble();
            //Methods to calculate Benefit
            System.out.println("Enter benefit:");
            benefit = income - cost;
        }
}
