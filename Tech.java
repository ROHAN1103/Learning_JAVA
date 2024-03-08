import java.util.Scanner;

public class Tech {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        int fin=num;
        String a=Integer.toString(num);
        int size=a.length();
        int div=size/2;
        int z=1;
        for(int i=0;i<div;i++)
        {
            z=z*10;
        }
        if(size%2!=0)
            System.out.println("Not Possible");
        else{
            int p1=num%z;
            int p2=num/z;
            int sum=p1+p2;
            int sqr=sum*sum;
            if(fin==sqr)
                System.out.println("Yes, It's a tech number.");
            else
                System.out.println("No, It's not a tech number");
                
        }

    }
}
