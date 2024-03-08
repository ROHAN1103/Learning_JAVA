import java.util.*;
public class Peterson {
    public static int factorial(int num)
    {
        int f=1;
        for(int i=num;i>1;i--)
        {
            f=f*i;

        }
        return f;
    }
    public static void main(String args[])
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        int fial=num;
        String a = Integer.toString(num);
        int size = a.length();
        for(int i=0;i<size;i++)
        {
            int temp=num%10;
            int check=factorial(temp);
            sum=sum+check;
            num=num/10;
        }
        if(fial==sum)
        {
            System.out.println("Yes, it's a peterson number");
        }
        else
            System.out.println("It's not a peterson number ");
    }
}
