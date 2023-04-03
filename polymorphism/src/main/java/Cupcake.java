public class Cupcake extends Cake{
    private int quantity;
    private int boxes;
    public Cupcake(String name, String baseFlavour, boolean healthier, boolean glutenFree, int quantity, int numberOfBoxes){
        super(name, baseFlavour,healthier,glutenFree);
        this.quantity = quantity;
        this.boxes = numberOfBoxes;
    }
//    getters and setters
    public int getQuantity(){
        return this.quantity;
    }
    public int getBoxes(){
        return this.boxes;
    }
//    methods
    public String fancyCupcakeCase(){
        return "Fancy cupcake case added.";
    }
}
