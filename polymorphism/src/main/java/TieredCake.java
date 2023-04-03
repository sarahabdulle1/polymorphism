public class TieredCake extends Cake{
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

}
