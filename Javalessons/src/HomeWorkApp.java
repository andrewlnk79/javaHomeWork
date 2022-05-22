public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    static void printThreeWords() {
        System.out.println("Apple");
        System.out.println("Banana");
        System.out.println("Orange");
    }
    static  void checkSumSign() {
        int a =200;
        int b=52;
        if (a+b>=0) {
            System.out.println(
                    "positive summ");
    }
        else
            System.out.println("negative summ");

    }
    static void printColor() {
        int valeu = 0; valeu = 101;
        if (valeu <=0)
            System.out.println("Red");
        else
           if (valeu>=0 && valeu<=100)
               System.out.println("Yellow");
           if (valeu>100)
               System.out.println("Green");
    }
    static void compareNumbers() {
        int a = 1;
        int b =2;
        if ( a>=b)
        System.out.println("a>=b");
        else {
            System.out.println("a<b");
    }

    }

}
