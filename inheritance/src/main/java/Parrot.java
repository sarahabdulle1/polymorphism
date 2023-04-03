public class Parrot extends Bird {

    //Constructor
    public Parrot(String name){
        super(name);
    }

    @Override
    public String makeNoise(){
        return "SQUAWK";
    }

}
