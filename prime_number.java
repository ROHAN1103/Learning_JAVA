public class prime_number {
    public static void main(String args[]) {
        System.out.print("1 2 3");
        int flag = 0, i = 2;
        while (i <= 100) {
            int mid = i / 2;
            if (i % 2 != 0) {
                for (int j = mid; j > 1; j--) {
                    if (i % j == 0) {
                        flag = 0;
                        break;
                    } else {
                        flag = 1;
                    }
                }
                if (flag == 1) {
                    System.out.print(" " + i);
                }
            }
            i++;
        }

    }
}
