package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullFood;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullFood=false;

    }
    void setFullFood(boolean status){
        fullFood=status;
    }
    void eat(Plate plate){
        if (!fullFood){
            fullFood= plate.decreaseFood(appetite);
        }
    }
    @Override
    public String toString(){
        return "name:"+name+" ,appetite:"+appetite+" ,full:"+fullFood;
    }







}
