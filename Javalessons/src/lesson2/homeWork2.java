package lesson2;

public class homeWork2 {
    public static void main(String[] args) {
        // a,b -between method, i-positiveornegative method
        System.out.println(between(5,20));
        positiveOrNegative(2);

    }
static boolean between(int a, int b) {
    int s = a+ b;
    if(s<=20 && s>=10){
    return true;
    }
    else { return false;

    }
}
static void positiveOrNegative(int i) {


    if (i >= 0) {

        System.out.println("positive");
    } else {
        System.out.println("negative");
    }
}
}


