import java.util.Scanner;
public class Number_type {
    public static void main(String args[])
    {
        int flag1=0,flag2=0;
        System.out.print("Enter the Number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==2)
        {
            System.out.println("The number is Even and Prime");
        }
        if(num==3)
        {
            System.out.println("The number is Odd and Prime");
        }
        if(num>3)
        {
            System.out.println();
            
        System.out.print("The Number is");
        if(num%2==0)
        {
            flag1=1;
        }
        int mid=num/2;
        for(int i=mid;i>1;i--)
        {
            if(num%i==0)
            {
                flag2=0;
                break;
            }
            else
                flag2=1;
        }
        if(flag1==1)
            System.out.print(" Even ");
        else
            System.out.print(" Odd ");

        if(flag2==1)
            System.out.print("and Prime ");
        else
            System.out.print("and Composite ");


        }
        
    }
}
