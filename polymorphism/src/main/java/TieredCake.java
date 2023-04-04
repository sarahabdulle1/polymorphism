import interfaces.ISell;
public class TieredCake extends Cake implements ISell{
    private int tiers;
    public TieredCake(String name, String baseFlavour, boolean healthier, boolean glutenFree,int tiers){
        super(name, baseFlavour, healthier, glutenFree);
        this.tiers = tiers;
    }
    public int getTiers(){
        return this.tiers;
    }
    public String addCakeStand(){
        return "This cake comes with a cake stand!";
    }
    public String addIcing(){
        return "Use more icing for tiered cakes.";
    }

//    overload the display method
    public String display(){
        return "Display cake.";
        }
    public String display(int quantity) {
        if (quantity == 1) {
            return "Display " + quantity + " cake by the shop window.";
        }
        if (quantity > 1) {
            return "Display " + quantity + " cakes by the shop window.";
        }
        return null;
    }
//    implement interface ISell method
    public String sell(double price, int quantity) {
        if (quantity == 1) {
            return "Sell " + quantity + " tiered cake for £" + price;
        }
        if (quantity > 1) {
            double totalPrice = price * quantity;
            return "Sell " + quantity + " tiered cakes for £" + totalPrice;
        }
        return null;
    }
}
