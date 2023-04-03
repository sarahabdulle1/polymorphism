import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ParrotTest {
    Parrot parrot;
    @BeforeEach
    public void setUp(){
        parrot = new Parrot("Iago");
    }

    @Test
    public void parrotCanLayEgg(){
        assertThat(parrot.layEgg()).isEqualTo("I laid an egg!");
    }


}
