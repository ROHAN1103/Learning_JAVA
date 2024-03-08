import java.util.Scanner;
public class neon {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int sqr=num*num;
        int sum=0;
        String a= Integer.toString(sqr);
        int size=a.length();
        for(int i=0;i<size;i++)
        {
            int temp=sqr%10;
            sum=sum+temp;
            sqr=sqr/10;

        }
        if(sum==num)
            System.out.println("Yes, It's Neon");
        else
            System.out.println("It's not Neon");
    }
}
