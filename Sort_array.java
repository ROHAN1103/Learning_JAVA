import java.util.Arrays;
import java.util.Collections;
public class Sort_array {
 public static void main(String args[])
 {
    int arr[]=new int[]{1,5,2,8,7,6};
    int asce[]=new int[arr.length];
    Arrays.sort(arr);
    System.out.println("Ascending order:");
    for(int i=0;i<arr.length;i++)
        System.out.print(" "+arr[i]);
    System.out.println("\nDescending order:");
    for(int i=arr.length-1;i>=0;i--)
        System.out.print(" "+arr[i]);

 }   
}
