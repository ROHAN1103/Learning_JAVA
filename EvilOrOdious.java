import java.util.Scanner;
public class EvilOrOdious {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        String bin=Integer.toBinaryString(num);
        int test=Integer.parseInt(bin);
        int len=bin.length(),tin=test;
        int count=0;
        for(int i=0;i<len;i++)
        {
            int c=test%10;
            if(c==1)
                count++;
            test=test/10;

        }
        System.out.println(bin);
        if(count%2==0)
            System.out.println("Yes, It's a EVIL number.");
        else
            System.out.println("No, It's not a EVIL number.");
    }
    
}
