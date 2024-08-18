import java.util.*;
public class Odd_and_even {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("Even numbers: ");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
                System.out.print(" "+arr[i]);
        }
        System.out.println();
        System.out.println("Odd Numbers: ");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
                System.out.print(" "+arr[i]);
        }
    }
    
}
