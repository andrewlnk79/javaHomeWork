package lesson7;

public class App {
    public static void main(String[] args) {


        Cat[] cats = {
                new Cat("Barsik", 10), new Cat("Marsik", 15),new Cat("Basya",20)
        };
        Plate plate = new Plate(30, 50);
        for (
                Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        //добавление еды
        System.out.println(plate);
        plate.add(40);


    }
}
