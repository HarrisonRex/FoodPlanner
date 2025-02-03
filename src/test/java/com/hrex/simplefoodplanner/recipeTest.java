package com.hrex.simplefoodplanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class RecipeTest {

  private Recipe testRec;
  private Ingreadient testIng;
  
  @BeforeEach
  void setUpTests() {//before each test
    testRec = new Recipe("test");
    testIng = new Ingreadient("test", 69);
  }


  @Test
  void testMakeRecipe(){ // making a recipe object
    Recipe test0 = new Recipe("test0");
  }

  @Test
  void testGetters() {
    //assert all getters to test ob
  }

  
  @Test
  void testSetters() {
    //assert all setters to test ob
  }
  
  @Test
  void testAddIng(){
    Ingreadient tIng = new Ingreadient("test", 69);
    testRec.addIngreadient(tIng);
    //asserst the new list meets the old list + the ing
  }
  
  @Test
  void testRemoveIng(){
    //by name

    //by index

  }

  @Test
  void testEditRecipeIng(){
    

  }
}
