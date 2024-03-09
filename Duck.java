import java.util.Scanner;
public class Duck {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int test=num;
        String a=Integer.toString(num);
        int len=a.length();
        int flag=0,temp=1;
        for(int i=0;i<len;i++)
        {
            temp=temp*10;
        }
        temp=temp/10;
        for(int i=0;i<len;i++)
        {
            int temp1=test%10;
            if(temp1==0)
            {
                flag=1;
            }
            test=test/10;
            
        }
        if(flag==1)
        {
            if(num/temp==0)
                flag=0;
        }
        if(flag==1)
            System.out.println("Yes, It's a DUCK number");
        else
            System.out.println("No, It's not a DUCK number");

    }
    
}
