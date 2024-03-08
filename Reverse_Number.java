import java.util.Scanner;
public class Reverse_Number {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to Reverse :");
        int num=sc.nextInt();
        String a=Integer.toString(num);
        int size=a.length();
        int reverse=0;
        for(int i=0;i<size;i++)
        {
            int temp=num%10;
            num=num/10;
            reverse=(reverse*10)+temp;
        }
        System.out.println("The reverse of a number "+a+" is "+reverse);
    }
}
