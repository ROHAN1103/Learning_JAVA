import java.util.Scanner;
public class Nth_PrimeNumber {
    public static int prime(int num)
    {
        int mid=num/2,flag=1;
        for(int i=2;i<mid;i++)
        {
            if(num%i==0)
                flag=0;
        }
        return flag;

    }

    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value for N: ");
        int num=sc.nextInt(),count=0,i=2;
        while(true)
        {
            i=i+1;
            int flag=prime(i);
            //System.out.println(i+" "+flag);
            if(flag==1)
                count++;
            if(count==num)
                {
                    System.out.println(i);
                    break;
                
        }}
        
    }
}
