public class Print_on_even {
    public static void main(String args[])
    {
        int arr[]=new int[]{0,1,2,3,4,5,6,7,8,9};
        System.out.println("Printing number in even places");
        for(int i=0;i<arr.length;i++)
            if(i%2!=0)
                System.out.print(" "+arr[i]);
        System.out.println("\nPrinting number in ODD places");
            for(int i=0;i<arr.length;i++)
                   if(i%2==0)
                        System.out.print(" "+arr[i]);
    }
    
}
