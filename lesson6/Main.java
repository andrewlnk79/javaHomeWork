package lesson6;

import static lesson6.Animal.getCountOfAnimals;

public class Main {

    public static void main(String[] args) {
        lesson6.Cat cat=new lesson6.Cat("Barsik",200,0);
        lesson6.Dog dog=new lesson6.Dog("Bobik",500,10);
        System.out.println(cat.run(80));
        System.out.println(cat.swim(1));
        System.out.println(dog.run(150));
        System.out.println(dog.swim(8));

        System.out.println("summOfAnimals"+" "+getCountOfAnimals());


    }

}
