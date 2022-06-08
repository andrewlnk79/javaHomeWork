package lesson6;


import HomeWork.Javalessons.src.lesson6.MyInterface;

public class Animal implements MyInterface {
    public String name;
    public int distRun;
    public int distSwim;
    public static int countOfAnimals = 0;


    public Animal(String name, int distRun, int distSwim) {
        this.name = name;
        this.distRun = distRun;
        this.distSwim = distSwim;
        countOfAnimals++;

    }

    public static int getCountOfAnimals() {
        return countOfAnimals;
    }

    @Override
    public String run(int distance) {
        if (distance > distRun) {
            return name + "could`t run " + distance;
        } else {
            return name + "has run " + distance;
        }

    }

    @Override
    public String swim(int distance) {
        if (distance > distSwim) {
            return name + "could`t swim " + distance;
        } else {
            return name + "has swim " + distance;
        }
    }

}
