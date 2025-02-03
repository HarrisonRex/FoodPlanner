package com.hrex.simplefoodplanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class IngreadientInterface {

	private static ArrayList<Ingreadient> ingsIn = new ArrayList<Ingreadient>();


//Loads the ingreadients from file
  public static void loadIngreads() {
    try {
      File myObj = new File("src\\main\\resources\\ingredients.txt");
      Scanner sc = new Scanner(myObj);
      while (sc.hasNextLine()) {
        String data = sc.nextLine();
        addIng(data);
      }
      sc.close();
    } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  }
  
  //Adds the lines to the arraylist
  public static void addIng(String line) {
    int[] comLocations = new int[3];
    String temp = line;
    int j = 0;
    
    for(int i = 0; i < 3 -1; i++) {
      while(temp.charAt(0)!=',') {
        temp = temp.substring(1);
        j++;
      }
      j++;
      temp = temp.substring(1);
      comLocations[i] = j;
    }
    
    String name = line.substring(comLocations[0],comLocations[1]-1);
    double amountStock = Double.parseDouble(line.substring(comLocations[1])); 
    
    ingsIn.add(new Ingreadient(name, amountStock));
  }

  //tsd
  public static List<Ingreadient> getIngredients(){
      loadIngreads();
      return ingsIn;
  }
  
}