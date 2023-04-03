import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ZooTest {
    Zoo zoo;

    @BeforeEach
    public void setUp(){
        zoo = new Zoo();
    }

    @Test
    public void zooStartsEmpty(){
        assertThat(zoo.countAnimals()).isEqualTo(0);
    }
    @Test
    public void canAddAnimal() {
        Animal animal = new Lion("Simba", false);
        zoo.addAnimal(animal);
        assertThat(zoo.countAnimals()).isEqualTo(1);
    }
//    debug: check opening and closing curly brackets

}
