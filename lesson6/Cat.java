package lesson6;

public class Cat extends lesson6.Animal {
    Cat(String name,int distRun, int distSwim) {
        super(name,distRun,distSwim);






    }
    @Override
    public String swim(int distance){
        return "cat"+name+"can`t swim";
    }

}
