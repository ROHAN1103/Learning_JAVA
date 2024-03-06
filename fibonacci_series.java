public class fibonacci_series {
    public static void main(String args[]) {
        int a = 0, b = 1, x;
        System.out.print(a);
        System.out.print(" " + b);

        for (int i = 0; i < 10; i++) {

            x = a + b;
            System.out.print(" " + x);
            a = b;
            b = x;
        }

    }

}