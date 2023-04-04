
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
    public String addToppings(){
        return "Toppings are added.";
    }

//    ABSTRACT METHOD - AddIcing() - no new parameters
    public abstract String addIcing();
//    abstract method - DISPLAY CAKE BY SHOP WINDOW (CUPCAKE/TIERED CAKE) - add differing parameters
    public abstract String display();
}
