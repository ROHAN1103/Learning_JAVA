import java.lang.Math;
import java.util.Random;

public class Generating_RandomNumber {
    public static void main(String args[]) {
        int max = 750, min = 500;
        double a = Math.random();
        int b = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("First random number :" + a);
        System.out.println("RandomNumber between 500 to 750 :" + b);
        Random random = new Random();
        int x = random.nextInt();
        int Y = random.nextInt(20);
        double Z = random.nextDouble();
        double A = random.nextDouble(25.00);
        float B = random.nextFloat();
        float C = random.nextFloat(30);
        long D = random.nextLong();
        boolean E = random.nextBoolean();

        System.out.println("Int                     :" + x);
        System.out.println("Int within 20           :" + Y);
        System.out.println("Double                  :" + Z);
        System.out.println("Double within 25.00     :" + A);
        System.out.println("Float                   :" + B);
        System.out.println("Float within 30         :" + C);
        System.out.println("Long                    :" + D);
        System.out.println("boolean                 :" + E);

    }
}
