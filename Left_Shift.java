public class Left_Shift {
    public static void main(String args[])
    {
        int arr[]=new int[]{0,1,2,3,4,5,6,7,8,9};
        int shift[]=new int[arr.length];
        int top=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            shift[i-1]=arr[i];
        }
        shift[arr.length-1]=top;
        for(int i=0;i<arr.length;i++)
            System.out.println(" "+shift[i]);
    }
    
}
