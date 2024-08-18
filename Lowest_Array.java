public class Lowest_Array {
    public static void main(String args[])
    {
        int arr[]=new int[]{1,10,4,2,3};
        int lowest=10000;
        for(int i=0;i<arr.length;i++)
        {
            if(lowest>arr[i])
                lowest=arr[i];
        }
        System.out.println("lowest :"+lowest);
    }
    
}
