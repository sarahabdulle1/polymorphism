public abstract class Bird extends Animal{
    public Bird(String name){
        super(name);
    }
    public String layEgg() {
        return "I laid an egg!";
    }
    public String fly(){
        return "I believe I can fly!";
    }

}
