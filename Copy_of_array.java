public class Copy_of_array
{
    public static void main(String args[])
    {
        int a[]=new int[]{1,2,3,4,5};
        int b[]=new int[a.length];
        int x=a.length-1;
        for(int i=0;i<a.length;i++)
       {
            b[i]=a[i];
            x--;
        }
        System.out.print("Original Array :");
        for(int i=0;i<b.length;i++)
        {
            System.out.print(a[i]);
        }
        
        System.out.print("\nDuplicate Array :");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(b[i]);
        }
    }
    
}