import java.util.Scanner;
public class Xylem_Phloem {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        String a=Integer.toString(num);
        int len=a.length(),x=num;
        int last=num%10,first=0;
        //System.out.println("last "+last);
        for(int i=0;i<len-1;i++)
        {
            first=num/10;
            num/=10;
        }
        //System.out.println("first "+first);

        int sum1=last+first,sum2=0;
        for(int i=0;i<len-2;i++)
        {
            x/=10;
            int temp=x%10;
            sum2=sum2+(temp);
            //System.out.println(sum2+" "+x+" "+temp);
        }
        //System.out.println("sum1 , sum2 "+sum1+" "+sum2);

        if(sum1==sum2)
            System.out.println("Its a Xylem Number.");
        else
            System.out.println("Its a Phloem number.");

    }
}
