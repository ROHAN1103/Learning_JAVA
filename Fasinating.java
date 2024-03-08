import java.util.*;
public class Fasinating {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        String a=Integer.toString(num);
        int size=a.length();
        if(size<3)
        {
            System.out.println("Not Possible");
        }
        else{
            int once=num*2;
            int twice=num*3;
            String once1=Integer.toString(once);
            String twice2=Integer.toString(twice);
            String thrice=Integer.toString(num);
            String sum=once1+twice2+thrice;
            for(int i=1;i<=9;i++)
            {
                int count=0;
                if(sum.charAt(i)==i)
                {
                    count++;
                    if(count>1)
                    {
                        System.out.println("Not fasinating number ");
                        break;
                    }
                    
                }
                System.out.println("Yes, Fasinating number");

            }

        }
    }
}
