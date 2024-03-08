import java.util.*;
public class Sunny {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int act=num+1;
        double root=Math.sqrt(act);
        if(root-Math.floor(root)==0)
            System.out.println("Yes, the number is sunny.");
        else
            System.out.println("NO, the number is not sunny.");
    }
}
