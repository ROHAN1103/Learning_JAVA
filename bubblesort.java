public class bubblesort {
    public static void main(String args[]){
        int a[]={1,5,4,9,2,7,320};
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        for(int i=0;i<a.length-1;i++){
            for(int j=1;j<(a.length-i);j++){
                if(a[j-1]<a[j]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
        System.out.println();
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    
}
