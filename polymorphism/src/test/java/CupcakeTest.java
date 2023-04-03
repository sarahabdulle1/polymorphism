import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupcakeTest {
    Bakery bakery;
    Cake cake;
    Cupcake cupcake;

    @BeforeEach
    public void setUp() {
        bakery = new Bakery("Cakebox");
//        cupcake = new Cupcake("biscoff","chocolate", true, false, 6,1 );
    }
    @Test
    public void canGetBoxes(){
        cupcake = new Cupcake("biscoff","chocolate", true, false, 6,1 );
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
}
