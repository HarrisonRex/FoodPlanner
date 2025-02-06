package com.hrex.simplefoodplanner.userInterface;

import java.util.ArrayList;
import java.util.Scanner;

import com.hrex.simplefoodplanner.fileHandling.IngreadientInterface;
import com.hrex.simplefoodplanner.fileHandling.RecipeInterface;
import com.hrex.simplefoodplanner.objects.Ingreadient;
import com.hrex.simplefoodplanner.objects.Recipe;

public class commandLineInterface {

  private static ArrayList<Recipe> recipeList = new ArrayList<Recipe>();
  private static ArrayList<Ingreadient> ingreadientsList = new ArrayList<Ingreadient>();

  private static final Scanner sc = new Scanner(System.in);

  //start the interface
  public static void commandLineRun(){
    recipeList = RecipeInterface.getRecipes();
    ingreadientsList = IngreadientInterface.getIngredients();

    boolean running = true;
    while (running) {
        System.out.println("Select an operation: \n" +
                "1. Veiw Recipeis \n" +
                "2. Add Ings \n" +
                "3. Edit Ings \n" +
                "4. Edit Recipies \n" +
                "5. Close program");


        switch (sc.next()) {
            case "1":
              veiwRecipes();
            case "2":
              addIngreeds();
            case "3":
              if (ingreadientsList.size()>0) {
                editIngreeds();
              } else {
                System.out.println("IngreadientsList is empty!");
              }
              break;
            case "4":
               if (recipeList.size()>0) {
                 editRecipes();
             } else {
                  System.out.println("RecipeList is empty!");
              }
              break;
            case "5":
                RecipeInterface.saveRecipes(recipeList);
                IngreadientInterface.saveIngreadients(ingreadientsList);
                System.out.println("Bye Bye!");
                running = false;
                break;
            default:
                System.out.println("This is not a valid option from the list");
                break;
        }

        System.out.println();
    }
}

//1
  private static void veiwRecipes(){
    //Print the list
  }

//2
  private static void addIngreeds(){
    //Add Ingreadients to list
  }

//3
  private static void editIngreeds(){
    //Edit the ingreeds with an option todo so by -recipies
  }

//4
  private static void editRecipes(){
    //Edit the list of recipies
  }
}