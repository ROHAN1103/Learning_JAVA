import java.util.Scanner;
public class Largest_of_three {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First number: ");
        int x=sc.nextInt();
        System.out.print("Enter the Second number: ");
        int y=sc.nextInt();
        System.out.print("Enter the Third number: ");
        int z=sc.nextInt();
        int max=x>y?x:y;
        if(max>z)
            System.out.println("Maximum number is "+max);
        else
            System.out.println("Maximum number is "+z);
        
    }
}
