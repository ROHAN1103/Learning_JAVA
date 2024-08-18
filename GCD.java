import java.util.Scanner;
public class GCD {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First number: ");
        int x=sc.nextInt();
        System.out.print("Enter the Second number: ");
        int y=sc.nextInt();
        int max=x>y?x:y;
        int gcd=0;
        for(int i=max;i>0;i--)
        {
            if(x%i==0 && y%i==0)
            {
                if(i>gcd)
                {
                    gcd=i;
                }
            }
        }
        System.out.println("GCD :"+gcd);
    } 
}
