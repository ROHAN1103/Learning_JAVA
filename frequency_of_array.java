public class frequency_of_array {
    public static void main(String args[])
    {
        int arr[]=new int[]{11,1,9,2,2,2,3,8,2,5,5,5,1,7,11,9,8};
        int freq[]=new int[arr.length];
        int count=1;
        for(int i=0;i<arr.length;i++)
        {
            int temp=arr[i];
            //System.out.println("temp ="+temp);
            if(arr[i]!=-1)
            { 
                for(int j=i+1;j<arr.length;j++)
                {
                    if( arr[j]!=temp && freq[i]<2)
                        freq[i]=1;
                    else  if(arr[j]==temp && arr[j]!=-1)
                    {
                        arr[j]=-1;
                        //System.out.println("count before add = "+count);

                        count+=1;
                        //System.out.println("count after add = "+count);
                        freq[i]=count;
                    }
                    else if(arr[j]!=-1 && arr[j]!=temp && freq[i]<2)
                        freq[i]=1;
                    //System.out.println("freq= "+freq[i]+" arr[j]= "+arr[j]+"\n");
                }

            }
            count=1;
           
        }
        for(int k=0;k<arr.length;k++)
        {
            if(arr[k]!=-1)
                System.out.println(arr[k]+" === "+freq[k]);
        }
    }    
}
