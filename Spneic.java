import java.util.*;
public class Spneic {
    public static int arrsize(int num)
    {
        int temp=num/2;
        int j=0;
        while(temp>0)
        {
           
            if(num%temp==0)
            {
                j++;
            }
            temp--;  
        }
        return j;
    }
    public static int check_prime(int num) {
        int mid = (num / 2) + 1;
        int flag = 0;
        if(num==2 || num==1 || num==3)
            return 1;
        for (int i = 2; i < mid; i++) {
            if (num % i == 0) {
                flag = 0;
                break;
            } else
                flag = 1;

        }
        return flag;

    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num=sc.nextInt();
        int size=arrsize(num);
        int arr[]=new int[size];
        int temp=num/2;
        int j=0;
        while(temp>0)
        {
            if(num%temp==0)
            {
                arr[j]=temp;
                j++;
            }
            temp--;

            
        }
        for(int i=0;i<arr.length;i++)
        {
        System.out.print(" "+arr[i]);
        }
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            
            int temp1=0;
            int flag=0;
            flag=check_prime(arr[i]);
            if(flag!=1)
                arr[i]=0;
            System.out.print(" "+arr[i]);
        }
        int mul=1;
        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i]!=0)
            {
                mul=mul*arr[i];
            }
        }
        if(mul==num)
            System.out.println("Yes, It's a Spneic number");
        else
            System.out.println("No, It's not a spenic number");

        

    }
    
}
