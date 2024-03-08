import java.util.*;

public class number_to_word {
    public static String ones(int num) {
        String one[] = new String[] { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

        String a = one[num];
        return a;
    }

    public static String ten(int num) {
        String tens[] = new String[] { "Eleven", "twelve", "thirtheen", "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "ninteen" };
        String a = tens[num];
        return a;
    }

    public static String multi(int num) {
        String multi[] = new String[] { "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
                "ninty" };
        String a = multi[num];
        return a;
    }

    public static void fours(int num) {
        String word, words, wordss;
        int dup = num % 10;
        num = num / 10;
        int dup2 = num % 10;
        int dup3 = num / 10;
        if (dup == 0 && dup2 != 0) {
            word = multi(dup2 - 1);
            wordss = ones(dup3);
            System.out.println(wordss + " Hundred and " + word);
        }
        if (dup2 == 0 && dup != 0) {
            word = ones(dup);
            wordss = ones(dup3);
            System.out.println(wordss + " hundred and  " + word);

        }
        if (dup == 0 && dup2 == 0) {
            word = ones(dup3);
            System.out.println(word + " hundred");
        }
        if (dup != 0 && dup2 != 0 && dup3 != 0) {
            word = ones(dup);
            words = multi(dup2 - 1);
            wordss = ones(dup3);
            System.out.println(wordss + " hundred and " + words + " " + word);

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to convert : ");
        int num = sc.nextInt();
        String a = Integer.toString(num);
        int size = a.length();
        String word = "zero";
        String words = "Zero";
        String wordss = "zero";

        if (size >= 1) {
            if (size > 4) {
                System.out.println("Not possible");
            }
            if (size == 1) {
                word = ones(num);
                System.out.println(word);
            }
            if (size == 2) {
                if (num % 10 != 0 && num < 20) {
                    int temp = num % 10;

                    words = ten(temp - 1);
                    System.out.println(words);

                }
                if (num % 10 == 0) {
                    int temp = num / 10;
                    words = multi(temp - 1);
                    System.out.println(words);
                }

                if (num > 20) {
                    int tempo = num % 10;
                    int tempo2 = num / 10;
                    word = ones(tempo);
                    words = multi(tempo2 - 1);
                    System.out.println(words + " " + word);
                }

            }
            if (size == 3) {
                fours(num);

            }
            if (size == 4) {
                int temp = num / 1000;
                word = ones(temp);
                System.out.print(word + " thousand ");
                int major = num % 1000;
                fours(major);

            }

        }

    }

}
