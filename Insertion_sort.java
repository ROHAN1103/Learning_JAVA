public class Insertion_sort {
   
        public static void main(String args[]){
            int a[]={4,2,5,1,3,8,6};
            for(int i=1;i<a.length;i++){
                int cur=a[i];
                int j=i-1;
                while(j>=0 && a[j]>cur){
                    a[j+1]=a[j];
                    j--;
                }
                a[j+1]=cur;
            }
            for(int i=0;i<a.length;i++)
                System.out.print(a[i]+" ");
        }
        
    
    
    
}
