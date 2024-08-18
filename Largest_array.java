public class Largest_array {
    public static void main(String args[])
    {
        int arr[]=new int[]{1,10,4,2,3};
        int largest=0;
        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i])
                largest=arr[i];
        }
        System.out.println("largest :"+largest);
    }
    
}
