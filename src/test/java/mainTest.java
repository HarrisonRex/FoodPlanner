import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hrex.simplefoodplanner.Dish;

@SuppressWarnings("unused")
public class mainTest{

  @BeforeEach
  void setUpTests() {
    //before each test
  }


  @Test
  void testDish(){  // I am testing that i can make a dish
    Dish mumSauce = new Dish("MumSauce");
  }

}