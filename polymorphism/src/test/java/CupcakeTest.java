import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class CupcakeTest {
    Bakery bakery;
    Cake cake;
    Cupcake cupcake;

    @BeforeEach
    public void setUp() {
        bakery = new Bakery("Cakebox");
        cupcake = new Cupcake("biscoff","chocolate", true, false, 6,1 );
    }
    @Test
    public void canGetBoxes(){
        assertThat(cupcake.getBoxes()).isEqualTo(1);
    }

    @Test
    public void canGetQuantity(){
        cupcake = new Cupcake("biscoff","chocolate", true, false, 6,1 );
        assertThat(cupcake.getQuantity()).isEqualTo(6);
    }

    @Test
    public void isFancyCupcakeCase(){
        cupcake = new Cupcake("biscoff","chocolate", true, false, 6,1 );
        assertThat(cupcake.fancyCupcakeCase()).isEqualTo("Fancy cupcake case added.");
    }
    @Test
    public void canAddIcing(){
        cupcake = new Cupcake("biscoff","chocolate", true, false, 6,1 );
        assertThat(cupcake.addIcing()).isEqualTo("Use less icing for cupcakes.");
    }
    @Test
    public void canDisplay(){
        cupcake = new Cupcake("biscoff","chocolate", true, false, 6,1 );
        assertThat(cupcake.display(2, 6)).isEqualTo("Display 2 boxes filled with 6 cupcakes each by the shop window.");
    }
    @Test
    public void canSell() {
        assertThat(cupcake.sell(3.50, 3)).isEqualTo("Sell 3 cupcakes for £10.5");
    }
}
