import java.util.Scanner;
public class factorial_of_number {
    public static void main(String args[]) {
        System.out.print("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int factorial = 1;
        while (temp >= 1) {

            factorial = factorial * temp;
            temp--;
        }
        System.out.println("The Factorial of " + num + " is :" + factorial);
    }
}
