public class Lion extends Animal {
// no multiple inheritances in java
    private boolean canWaitToBeKing;
//    create constructor
    public Lion(String name, boolean canWaitToBeKing){
        super(name); // this calls the parent class (akin to Animal())
        this.canWaitToBeKing = canWaitToBeKing;
    }
//    overriding
    @Override
    public String makeNoise(){
        return "ROAR";
    }


}
