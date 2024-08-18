public class Right_shift {
    public static void main(String args[])
    {
        int arr[]=new int[]{0,1,2,3,4,5,6,7,8,9};
        int shift[]=new int[arr.length];
        int bottom=arr[arr.length-1];
        for(int i=0;i<arr.length-1;i++)
        {
            shift[i+1]=arr[i];
        }
        shift[0]=bottom;
        for(int i=0;i<arr.length;i++)
            System.out.println(" "+shift[i]);
    }
    
}
