package com.hrex.simplefoodplanner.interfaces;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;

import com.hrex.simplefoodplanner.Recipe;
import com.hrex.simplefoodplanner.etc.units;

import java.util.ArrayList;
import java.util.List;

public class RecipeInterface {

  private static ArrayList<Recipe> recipesList = new ArrayList<Recipe>();
  private static String filePath = "src\\main\\resources\\recipes.txt";

  //Load file and read
  
  private static void loadRecipes(){
    try {
      File fileI = new File(filePath);
      Scanner sc = new Scanner(fileI);
      while (sc.hasNextLine()) {
        String data = sc.nextLine();
        addRecipe(data);
      }
      sc.close();
    } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  }
  private static int recipeFeilds = 2;
  //Populate the arraylist
  private static void addRecipe(String line){
    String[] comLocations = line.split(",");

    for (int i=0; i<comLocations.length; i++){
      System.out.println(comLocations[i]);
      //recipesList.add(comLocations[i]);
    }
    //recipesList.add(new Recipe(comLocations[0],comLocations[1]));
  }

  public static List<Recipe> getRecipes(){
    loadRecipes();
    return recipesList;
  }

}
