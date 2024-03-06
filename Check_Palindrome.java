import java.util.Scanner;

public class Check_Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int dig = num;
        int temp = 0;
        while (num != 0) {
            int rem = num % 10;
            num = num / 10;
            temp = temp * 10 + rem;
        }
        if (temp == dig) {
            System.out.println("It is a Palindrome");
        } else
            System.out.println("It is Not Palindrome");
    }
}
