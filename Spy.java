import java.util.Scanner;
public class Spy {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int pro=1,sum=0;
        int num=sc.nextInt();
        String a=Integer.toString(num);
        int size=a.length();
        for(int i=0;i<size;i++)
        {
            int temp=num%10;
            pro*=temp;
            sum+=temp;
            num=num/10;
        }
        if(sum==pro)
            System.out.println("Yes It's a SPY number");
        else
            System.out.println("Not a SPY number");
    }
}
