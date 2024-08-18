public class LinearSearch {
    public static void main(String args[]){
        int a[]={1,20,54,8,3};
        int key=15,flag=0;
        for(int i=0;i<a.length;i++){
            if(key==a[i])
            {
                System.out.println("Element "+key+" is found at "+(i+1));
                flag=1;
            }
            if(i==a.length-1 && flag==0)
                System.out.println("Element Not found");
        }
    }
    
}
