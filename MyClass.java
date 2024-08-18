import java.util.Scanner;
public class MyClass {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N:");
        int N=sc.nextInt();// represents the index of the glass which has the gem
        N=N-1;//To bring the N with in the index i.e 0,1,2
        int a[]={0,0,0};
        System.out.print("Arrays Before N:       ");
            for(int j=0;j<a.length;j++)
                        System.out.print(a[j]+" ");
        if(N<3){
            a[N]=1;
            System.out.print("\nArrays after N:        ");
            for(int j=0;j<a.length;j++)
                        System.out.print(a[j]+" ");
            int pos1=-1,pos2=-1;//reprents the index of the glasses which is need to be swapped
            for(int i=0;i<3;i++){
                pos1=sc.nextInt();
                pos1=pos1-1;//To bring the pos1 with in the index i.e 0,1,2
                pos2=sc.nextInt();
                pos2=pos2-1;//To bring the pos2 with in the index i.e 0,1,2
                if(pos1>=0 && pos1<3 && pos2>=0 && pos2<3){//checking the value is within range;
                    int temp=a[pos1];//swapping
                    a[pos1]=a[pos2];
                    a[pos2]=temp;
                    temp=0;
                    System.out.print("Arrays after swapping for "+(i+1)+" time.       ");
                    for(int j=0;j<a.length;j++)
                        System.out.print(a[j]+" ");
                }
                
            }
            for(int i=0;i<a.length;i++){
                if(a[i]==1)//checking in the array in which index 1 is present
                    System.out.println("\nThe index is: "+(i+1));// printing the index where there is 1 (i+1)because to bring in range of 1 to 3 
            }
        }
        else   
        System.out.println("\nThe index is: "+(N+1));
    }
    
}
