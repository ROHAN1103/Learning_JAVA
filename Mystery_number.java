import java.util.Scanner;
public class Mystery_number {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        String a=Integer.toString(num);
        int len=a.length();
        int temp1=0,temp2=0;
        int box=0;
        if(num>=22 && num<=198 &&num%11==0)
        {
            int rev=0,chk=0;
            box=num/11;
            for(int i=0;i<len;i++)
            {
                chk=box%10;
                rev=rev+chk*10;
                box=box/10;

            }
            if(11*(box+rev)==num)
            System.out.println("Yes, It's a Mystery number");

        }
        else
            System.out.println("Not a Mystery number");

    }
}
