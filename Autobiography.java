import java.util.*;
public class Autobiography {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int num2=num;
        int flag=0,flag1=0,flag2=0;
        String a=Integer.toString(num);
        int size=a.length();
        int arr[]=new int[size];
        int j=0;
        for(int i=0;i<size;i++)
        {
            arr[i]=num2%10;
            num2=num2/10;
        }
        int rra[]=new int[size];
        for(int i=arr.length-1;i>=0;i--)
        {
            rra[j]=arr[i];
            j++;   
        }
        int f=rra[0];
        int s=rra[1];
        int t=rra[2];
        //System.out.println(f+" "+s+" "+t);
        int count=0,count1=0,count2=0;
        for(int i=0;i<rra.length;i++)
        {
            
            if(rra[i]==0)
                count++;
            if(rra[i]==1)
                count1++;
            if(rra[i]==2)
                count2++;
            
            if(count==f)
                flag=1;
            if(count1==s)
                flag1=1;
            if(count2==t)
                flag2=1;     
            
           // System.out.println("value "+rra[i]+" zeros "+count+" ones "+count1+" twos "+count2+" flag1 "+flag+" flag2 "+flag1+" flag3 "+flag2);
        }
        if(flag==1 && flag1==1 && flag2==1)
            System.out.println("Yes, It's a Autobiographic number");
        else
            System.out.println("No, It's not a Autobiographic number");

        
       
        
    }
}
