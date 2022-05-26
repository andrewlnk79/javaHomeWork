package lesson2;

public class homeWork2 {

    public static void main(String[] args) {

        System.out.println(between(5, 5));
        positiveOrNegative(-2);
        System.out.println(negativeNumber(3));
        printstring(5, "hello");

    }

    static boolean between(int a, int b) {
        int s = a + b;
        if (s <= 20 && s >= 10) {
            return true;
        } else {
            return false;

        }
    }

    static void positiveOrNegative(int i) {

        if (i >= 0) {

            System.out.println("positive");
        } else {
            System.out.println("negative");

        }
    }

    static boolean negativeNumber(int a) {
        return a < 0;
    }

    static void printstring(int count, String s) {
        for (int i = 0; i < count; i++)

        System.out.println(s);
    }

}
