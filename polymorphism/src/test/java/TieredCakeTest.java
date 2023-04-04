
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TieredCakeTest {

    Bakery bakery;
    Cake cake;
    TieredCake tieredCake;
    @BeforeEach
    public void setUp() {
        bakery = new Bakery("Cake and Bakes");
        tieredCake = new TieredCake("Kinder tower","Kinder choco", false, false, 3);
    }
    @Test
    public void canGetTiers(){
        assertThat(tieredCake.getTiers()).isEqualTo(3);
    }
    @Test
    public void canAddCakeStand(){
        assertThat(tieredCake.addCakeStand()).isEqualTo("This cake comes with a cake stand!");
    }
    @Test
    public void canAddIcing(){
        assertThat(tieredCake.addIcing()).isEqualTo("Use more icing for tiered cakes.");
    }
    @Test
    public void canDisplay(){
        assertThat(tieredCake.display(1)).isEqualTo("Display 1 cake by the shop window.");
    }
    @Test
    public void canSell(){
        assertThat(tieredCake.sell(5.00, 2)).isEqualTo("Sell 2 tiered cakes for £10.0");
    }

}
