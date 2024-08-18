public class Selection_sort {
    public static void main(String args[]){
        int a[]={1,5,7,2,9,4};
        for(int i=0;i<a.length-1;i++){
            int smallest=i;
            for(int j=i;j<a.length;j++){
                if(a[j]<a[smallest]){
                    int temp=a[smallest];
                    a[smallest]=a[j];
                    a[j]=temp;
                }
            }
            /*for(int k=0;k<a.length;k++)
                System.out.print(a[k]+" ");
            System.out.println();*/
        }
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    
}
