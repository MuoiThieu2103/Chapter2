import java.util.Random;

public class Bai3 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(10));
        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());
        System.out.println(random.nextFloat());
        System.out.println(random.nextGaussian());
        random.setSeed(12345);
        System.out.println("Seed set to 12345");

        byte[] randomBytes = new byte[10];
        random.nextBytes(randomBytes);
        System.out.print("Random Bytes: ");
        for (byte b : randomBytes) {
            System.out.print(b + " ");
        }
        System.out.println();

        System.out.println("Random Integer (10-19): " + random.nextInt(10, 20));
    }
}
