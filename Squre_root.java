import java.util.Scanner;
public class Squre_root {
    public static double sqrot(int num)
    {
        double temp;
        double sq=num/2;
        do{
            temp=sq;
            sq=(temp+(num/temp))/2;
        }
        while((temp-sq)!=0);
        return sq;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        System.out.println("The square root of "+num+" is :"+sqrot(num));
    }
}
