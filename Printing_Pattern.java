import java.util.Scanner;

public class Printing_Pattern {
    public static void main(String args[]) {
        int i, j, row = 6;

       /* for( i=0;i<row;i++)
        {
            for( j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        /*for (i = 0; i < row; i++) {
            for (j = 2 * (row - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        for(i=0;i<row;i++)
        {
            for(j=row-i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*for(i=0;i<row;i++)
        {
            for(j=row-i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=row;i>1;i--)
        {
            for(j=row-i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/
    }
}
