public abstract class Animal {
// abstract classes cannot bbe instantiated - an animal object cannot be created
//    you cannot use --> new Animal() this is the only limitation
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public String makeNoise() {
//        return "Hello my name is"+ this.name +".";name
        return String.format("Hello, my name is %s.", this.name);
    }
    public String eat(){
        return "Mmm, that was tasty!";
    }
}
