import java.util.Scanner;
public class Smallest_of_three {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First number: ");
        int x=sc.nextInt();
        System.out.print("Enter the Second number: ");
        int y=sc.nextInt();
        System.out.print("Enter the Third number: ");
        int z=sc.nextInt();
        int min=x<y?x:y;
        if(min<z)
            System.out.println("Minimum number is "+min);
        else
            System.out.println("Minimum number is "+z);
        
    }
}
