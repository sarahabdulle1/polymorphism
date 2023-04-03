import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

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
        tieredCake = new TieredCake("Kinder tower","Kinder choco", false, false, 3);
        assertThat(tieredCake.getTiers()).isEqualTo(3);
    }
    @Test
    public void canAddCakeStand(){
        tieredCake = new TieredCake("Kinder tower","Kinder choco", false, false, 3);
        assertThat(tieredCake.addCakeStand()).isEqualTo("This cake comes with a cake stand!");
    }

}
