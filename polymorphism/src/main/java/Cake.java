import java.util.ArrayList;

public abstract class Cake extends Bakery {
    private String name;
    private String baseFlavour;
    private boolean healthier;
    private boolean glutenFree;

//    Constructor

    public Cake (String name, String baseFlavour, boolean healthier, boolean glutenFree){
        super(name);
        this.name = name;
        this.baseFlavour = baseFlavour;
        this.healthier = healthier;
        this.glutenFree = glutenFree;
    }
//    getters and setters

//    methods
    public String addIcing() {
        return "Icing is added.";
    }
    public String addToppings(){
        return "Toppings are added.";
    }

}
