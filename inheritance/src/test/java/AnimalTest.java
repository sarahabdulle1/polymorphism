import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AnimalTest {

    Animal animal; // putting objects outside the @BeforeEach
    @BeforeEach
    public void setUp(){
        animal = new Lion("Simba", false);
//        lion fits inside animal - polymorphism (poly -multiple morphism - shapes)

    }

//   TDD: Test Driven Development - tests passed first
//    Why TDD? You know for certain that that bit of code runs successfully, and you don't
//    have to worry about it failing/debugging as you focus on the rest of the code.
    @Test
    public void canMakeNoise(){
        assertThat(animal.makeNoise()).isEqualTo("Hello, my name is Simba.");
    }

    @Test
    public void canEat(){
        assertThat(animal.eat()).isEqualTo("Mmm, that was tasty!");
    }
}

