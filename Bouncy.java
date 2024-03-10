import java.util.Scanner;
public class Bouncy {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        String a=Integer.toString(num);
        int len=a.length(),flag1=0,flag2=0;
        int temp,temp1;
        temp=num%10;
        num=num/10;
        //System.out.println("temp temp1 flag1 flag2");
        for(int i=0;i<len-1;i++)
        {
            temp1=num%10;
            if(temp>temp1)
                flag1=1;
            if(temp<temp1)
                flag2=1;
            //System.out.println(temp+"      "+temp1+"       "+flag1+"      "+flag2);
            temp=temp1;
            num=num/10;            
        }
        if(flag1==1 && flag2==1)
            System.out.println("Its a Bouncy number");
        if(flag1==1 && flag2==0)
            System.out.println("Its a Incrising number");
        if(flag1==0 && flag2==1)
            System.out.println("Its a Decrising number");
    }
}
