import java.util.Scanner;
public class buzz {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int flag=0;
        if(num%10==7 || num%7==0)
            flag=1;
        if(flag==1)
            System.out.println("Yes ,It's a BUZZ number");
        else
            System.out.println("No, It's not a buzz number");
            
    }
}
