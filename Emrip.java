import java.util.Scanner;

public class Emrip {
    public static int check_prime(int num) {
        int mid = (num / 2) + 1;
        int flag = 0;
        for (int i = 2; i < mid; i++) {
            if (num % i == 0) {
                flag = 0;
                break;
            } else
                flag = 1;

        }
        return flag;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int rev = 0;
        int c1 = check_prime(num);
        String a = Integer.toString(num);
        int size = a.length();
        for (int i = 0; i < size; i++) {
            int temp = num % 10;
            rev = rev * 10 + temp;
            num = num / 10;
        }
        System.out.println(rev);
        int c2 = check_prime(rev);
        if (c1 == 1 && c2 == 1)
            System.out.println("Yes, it's a emrip number");
        else
            System.out.println("No, it's not a emrip number");

    }
}
