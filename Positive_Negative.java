import java.util.Scanner;
public class Positive_Negative {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        if(num>=1)
            System.out.println("The number is Positive");
        else if(num<0)
            System.out.println("The number is Negative");
        else 
            System.out.println("The number is neither Negative nor Positive");
    }
    
}
