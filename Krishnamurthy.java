import java.util.Scanner;
public class Krishnamurthy {
    public static int factorial(int x)
    {
        int pro=1;
        for(int j=x;j>0;j--)
        {
            pro=pro*j;
        }
        return pro;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt(),test=num;
        String a=Integer.toString(num);
        int size=a.length(),sum=0;
        for(int i=0;i<size;i++)
        {
            int temp=test%10;
            sum=sum+factorial(temp);
            test=test/10;
        }
        if(sum==num)
            System.out.println("Yes, the number is Krishnamurthy number");
        else
            System.out.println("No, the number is not Krishnamurthy number");
    }    

}
