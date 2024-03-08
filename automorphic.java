import java.util.*;

public class automorphic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int res = num * num;
        String a = Integer.toString(num);
        int size = a.length();
        int count = 1;
        for (int i = 0; i < size; i++) {
            count = count * 10;

        }
        int temp = res % count;
        if (num == temp) {
            System.out.println("Yes, it is a automporphic number");
        } else
            System.out.println("It's not a automorphic number");
    }
}
