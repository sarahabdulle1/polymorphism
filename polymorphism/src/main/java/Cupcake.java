import interfaces.ISell;
public class Cupcake extends Cake implements ISell{

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

//abstract method
    public String addIcing(){
        return "Use less icing for cupcakes.";
    }

//    overload method with display() - add parameters boxes and quantity
    public String display(){
        return "Display cake.";
    }
    public String display(int boxes, int quantity){
        return "Display " + boxes + " boxes filled with " + quantity + " cupcakes each by the shop window.";
    }
//    implement sell interface method
    public String sell(double price, int quantity){
        double totalPrice = price * quantity;
        return "Sell " + quantity + " cupcakes for £" + totalPrice;
    }
}


