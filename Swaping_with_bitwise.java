import java.util.Scanner;
public class Swaping_with_bitwise {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int f=sc.nextInt();
        System.out.print("Enter the second number: ");
        int s=sc.nextInt();
        System.out.println("Numbers before swapping");
        System.out.println("First "+f+" Second "+s);
        f=s^f;
        s=s^f;
        f=s^f;
        System.out.println("Numbers after swapping");
        System.out.println("First "+f+" Second "+s);

    }
}
