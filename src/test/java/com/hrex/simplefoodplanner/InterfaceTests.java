package com.hrex.simplefoodplanner;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hrex.simplefoodplanner.etc.units;
import com.hrex.simplefoodplanner.interfaces.RecipeInterface;

public class InterfaceTests {

  private Recipe testRec;
  private Ingreadient testIng;
  
  private ArrayList<Recipe> recipeList = new ArrayList<Recipe>();

  //both need tests for loading too 
  //also needs to not overwite the saved recipies :)

    @BeforeEach
  void setUpTests() {//before each test
    int amountTest = 3;
    for (int i=1;i<amountTest+1;i++){
      testRec = new Recipe("test"+i);
      testIng = new Ingreadient("testIn"+i, i*2, units.g, "Cumboard", i);
      testRec.addIngreadient(testIng);
      recipeList.add(testRec);
    }
  }

  @Test
  void testSaveRecipes() {
    RecipeInterface.saveRecipes(recipeList);
  }

  @Test
  void testSaveIngreadiants() {
    
  }
}
