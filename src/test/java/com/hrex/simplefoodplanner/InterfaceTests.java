package com.hrex.simplefoodplanner;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hrex.simplefoodplanner.etc.units;
import com.hrex.simplefoodplanner.fileHandling.IngreadientInterface;
import com.hrex.simplefoodplanner.fileHandling.RecipeInterface;
import com.hrex.simplefoodplanner.objects.Ingreadient;
import com.hrex.simplefoodplanner.objects.Recipe;

public class InterfaceTests {

  private Recipe testRec;
  private Ingreadient testIng;
  
  private ArrayList<Recipe> recipeList = new ArrayList<Recipe>();
  private ArrayList<Ingreadient> ingreadientsList = new ArrayList<Ingreadient>();

  //both need tests for loading too 
  //also needs to not overwite the saved recipies :)

  @BeforeEach
  void setUpTests() {//before each test
    int amountTest = 3;
    for (int i=1;i<amountTest+1;i++){
      testRec = new Recipe("test"+i);
      for(int j=i;j<amountTest+1;j++){
        testIng = new Ingreadient("testIn"+j+i, j*i, units.g, "Cumboard", i+j);
        ingreadientsList.add(testIng);
        testRec.addIngreadient(testIng);
      }
      recipeList.add(testRec);
    }
  }

  @Test
  void testSaveRecipes() {
    RecipeInterface.saveRecipes(recipeList);
    //Needs an actual assersion
  }

  @Test
  void testSaveIngreadiants() {
    IngreadientInterface.saveIngreadients(ingreadientsList);
  }
}
