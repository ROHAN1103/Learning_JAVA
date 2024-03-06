import java.util.Scanner;

public class Is_Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num = sc.nextInt();
        int temp1 = num;
        int number = num;
        int count = 0;
        int total = 0;
        while (temp1 > 0) {
            temp1 = temp1 / 10;
            count++;
        }
        while (num > 0) {
            int power = 1;
            int temp = num % 10;
            for (int i = 0; i < count; i++) {
                power = temp * power;
            }
            total = total + power;
            num = num / 10;

        }
        if (number == total)
            System.out.println("Yes, It's a Armstrong Number.");
        else
            System.out.println("No, It's Not a Armstrong Number.");

    }
}
