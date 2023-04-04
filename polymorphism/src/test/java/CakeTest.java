

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CakeTest {
    Bakery bakery;
    Cake cake;
    TieredCake tieredCake;
    @BeforeEach
    public void setUp(){
        bakery = new Bakery("Cake Shop");
        cake = new TieredCake("tiramisu", "coffee", false, false, 1);
    }
    @Test
    public void canAddToppings(){
        assertThat(cake.addToppings()).isEqualTo("Toppings are added.");
    }


}
