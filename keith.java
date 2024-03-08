import java.util.Scanner;
public class keith {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int a,b,c;
        String x=Integer.toString(num);
        int size=x.length();
        c=num%10;
        num=num/10;
        b=num%10;
        num=num/10;
        a=num%10;
        System.out.println(a+" "+b+" "+c);
        for(int i=0;i<10;i++)
        {
            int sum=a+b+c;
            a=b;
            b=c;
            c=sum;
            System.out.print(sum+" ");
        }
    } 
}
