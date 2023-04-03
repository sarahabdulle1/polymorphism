import java.util.ArrayList;

public class Bakery {
    private String bakery;
    private ArrayList<Cake> cakes;

    public Bakery(String name){
        this.bakery = name;
    }
    public void addCake(Cake cake){
        this.cakes.add(cake);
    }
}
