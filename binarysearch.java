public class binarysearch {
    public static void main(String args[]){
        int ar[]={2,4,5,6,8,9,12};
        int key=6;
        bsearch(ar,0,ar.length-1,key);       
    }
    public static void bsearch(int a[],int first,int last,int key){
        int mid=(first+last)/2;
        while(first<=last){
            if(a[mid]>key){
                last=mid-1;
            }
            else if(a[mid]<key){
                first=mid+1;
            }
            else if(a[mid]==key)
                {
                    System.out.println("Element fount at "+(mid+1));
                    break;
            }
            mid=(first+last)/2;
            if(first>last)
                System.out.println("Element not found");
                
        }
    }
    
}
