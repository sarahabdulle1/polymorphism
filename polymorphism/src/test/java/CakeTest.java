import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CakeTest {
    Bakery bakery;
    Cake cake;
    TieredCake tieredCake;
    @BeforeEach
    public void setUp(){
        bakery = new Bakery("Cake Shop");
//        cake = new Cake("biscoff", "chocolate", false, true);
//        bakery.addCake(cake);
    }
    @Test
    public void canAddIcing(){
        cake = new TieredCake("biscoff", "chocolate", false, true, 1 );
        assertThat(cake.addIcing()).isEqualTo("Icing is added.");
    }
    @Test
    public void canAddToppings(){
        cake = new TieredCake("tiramisu", "coffee", false, false, 1);
        assertThat(cake.addToppings()).isEqualTo("Toppings are added.");
    }


}
