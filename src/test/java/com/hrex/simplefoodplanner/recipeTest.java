package com.hrex.simplefoodplanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hrex.simplefoodplanner.etc.units;
import com.hrex.simplefoodplanner.objects.Ingreadient;
import com.hrex.simplefoodplanner.objects.Recipe;

@SuppressWarnings("unused")
public class RecipeTest {

  private Recipe testRec;
  private Ingreadient testIng;
  
  @BeforeEach
  void setUpTests() {//before each test
    testRec = new Recipe("test");
    testIng = new Ingreadient("test", 69, units.g, "Cumboard",1);
    testRec.addIngreadient(testIng);
  }


  @Test
  void testMakeRecipe(){ // making a recipe object
    Recipe test0 = new Recipe("test0");
  }

  @Test
  void testAddIng(){
    //adding
    testIng = new Ingreadient("testSet", 4, units.l, "Cumboard",1);
    testRec.addIngreadient(testIng);
    //asserst the new list meets the old list + the ing
    assertEquals("testSet", testRec.getIngreadients().get(1).getName());
    assertEquals(4, testRec.getIngreadients().get(1).getStockAmount());

    //remove by name
    testRec.removeIng("test");
    assertEquals(1, testRec.getIngreadients().size());

    //remove by index
    testRec.removeIng(0);
    assertTrue(testRec.getIngreadients().isEmpty());

    
  }

  @Test
  void testEditRecipeIng(){
    

  }
}