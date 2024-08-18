import java.util.*;
public class Sorting_array {
    public static void main(String args[]){
        int[] arr=new int[]{1,8,6,4,2,3,7,9};
        //Arrays.sort(arr);
        for( int i=0;i<arr.length;i++)
        {
            for( int j=i+1;j<arr.length;j++)
            {
                int x=0;
                if(arr[j]<arr[i])
                {
                    x=arr[i];
                    arr[i]=arr[j];
                    arr[j]=x;

                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
