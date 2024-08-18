import java.util.Scanner;
import java.util.Arrays;
public class Largest_Smallest_in_a_array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[]{5,3,1,4,6,2,7};
        int l1=arr[0],l2=l1,l3=l1,s1=l1,s2=l1,s3=l1;
        /*Arrays.sort(arr);
        s1=arr[0];
        s2=arr[1];
        s3=arr[2];
        l1=arr[6];
        l2=arr[5];
        l3=arr[4];*/
        for(int i=0;i<7;i++){
        //finding largest number
            if(arr[i]>l1){
                l1=arr[i];
            }
        }
        for(int i=0;i<7;i++)
        {
            if(arr[i]>l2 && arr[i]<l1)
                l2=arr[i];
        }
        for(int i=0;i<7;i++)
        {
            if(arr[i]>l3 && arr[i]<l2)
                l3=arr[i];
        }
        for(int i=0;i<7;i++)
        {
            if(arr[i]<s1 )
                s1=arr[i];
        }
        for(int i=0;i<7;i++)
        {
            if(arr[i]<s2 && arr[i]>s1)
                s2=arr[i];
        }
        for(int i=0;i<7;i++)
        {
            if(arr[i]<s3 && arr[i]>s2)
                s3=arr[i];
        }
        System.out.println("Smallest is "+s1);
        System.out.println("Second Smallest is "+s2);
        System.out.println("Third Smallest is "+s3);
        System.out.println("largest is "+l1);
        System.out.println("Second largest is "+l2);
        System.out.println("Third largest is "+l3);
    }
    
}
