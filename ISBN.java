import java.util.Scanner;

public class ISBN {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        long num=sc.nextLong(),sum=0;
        String a=Long.toString(num);
        int len=a.length();
        System.out.println(num+" "+len+" "+a);
        if(len==10)
        {
            for(int i=1;i<11;i++)
            {
                long temp=(num%10)*i;
                sum=sum+temp;
                System.out.println(i+" "+temp+" "+sum);
                num=num/10;
            }

            if(sum%11==0)
                System.out.println("Yes, the number is ISBN");
            else
                System.out.println("No, the number is not ISBN");

        }
        
    }
}
