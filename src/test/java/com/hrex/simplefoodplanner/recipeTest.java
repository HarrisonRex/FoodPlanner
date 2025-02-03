package com.hrex.simplefoodplanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
public class RecipeTest {

  private Recipe testRec;
  
  @BeforeEach
  void setUpTests() {//before each test
    testRec = new Recipe("test");
  }


  @Test
  void testMakeRecipe(){ // making a recipe object
    Recipe test0 = new Recipe("test0");
  }

  @Test
  void testAddIng(){
    Ingreadient tIng = new Ingreadient(false, null, 0);
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
