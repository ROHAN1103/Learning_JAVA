import java.util.Scanner;
public class Alternate_primenumber {
    public static int checkprime(int num)
    {
        int mid=num/2,flag=1;
        for(int i=2;i<=mid;i++)
        {
            if(num%i==0)
                flag=0;
        }
        return flag;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range: ");
        int num=sc.nextInt(),i=1;
        int even=0;
        while(num>0)
        {
            i++;
            int temp=checkprime(i);
            if(temp==1)
            {
               
                even++;
                if(even%2!=0)
                {
                    System.out.println(i);
                    num--;
                }
            }


        }
    }
}
