public class Print_duplicates {
    public static void main(String args[])
    {
        int arr[]=new int[]{1,2,3,4,3,8,2,9,8,1,5,5};
        int dup[]=new int[arr.length-1];
        for(int i=0;i<arr.length;i++)
        {
            int boss=arr[i];
            //System.out.println("boss = "+boss );
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]==boss)
                {
                    dup[i]=arr[j];
               }
               else if(dup[i]!=boss)
                    dup[i]=-1;
                //System.out.println("arr[j]="+arr[j]+" dup="+dup[i]);
            }
            
        }
        for(int i=0;i<arr.length-1;i++)
        {
            //System.out.println(" "+dup[i]);
            if(dup[i]!=-1)
                System.out.println(" "+dup[i]);
        }
    
    }
}
