import java.util.Scanner; 
public class Print_array {
    public static void main(String args[])
    {
        System.out.print("Enter the size : ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print(" Enter the number for "+(i+1)+" Place :");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
            System.out.print(" "+arr[i]);
    }
    
}
