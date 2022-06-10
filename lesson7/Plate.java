package lesson7;

public class Plate {
    private int food;
    private int voleum;

    public Plate(int food, int voleum) {
        this.food = food;
        this.voleum = voleum;
    }
    boolean decreaseFood(int portion){
        if (food<portion){
            return false;
        }
        food-=portion;
        return true;
    }
    void add(int food){
        if (this.food+food<=voleum){
            this.food+=food;
        }
    }
    @Override
    public String toString(){
        return "plate:"+food;
    }
}
