import java.util.*;
public class Remove_duplicate {
    public static void main(String args[]){
        int[] arr=new int[]{1,6,5,2,1,4,4,7,7,7,5,2,1,7,3,2};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(" "+arr[i]);
        System.out.println();
        for(int i=0;i<arr.length-1;i++)
        {
            int a=arr[i];
            if(arr[i]==arr[i+1])
            {
                arr[i+1]=0;
            }
        }
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
                System.out.print(" "+arr[i]);
        }
        
        
    }
}
