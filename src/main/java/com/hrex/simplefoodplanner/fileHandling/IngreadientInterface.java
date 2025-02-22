package com.hrex.simplefoodplanner.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hrex.simplefoodplanner.etc.units;
import com.hrex.simplefoodplanner.objects.Ingreadient;

public class IngreadientInterface {

	private static ArrayList<Ingreadient> ingsIn = new ArrayList<Ingreadient>();
  private static String pathFile = "src\\main\\resources\\ingredients.txt";


//Loads the ingreadients from file
  private static void loadIngreads() {
    
    try {
      File fileI = new File(pathFile);
      Scanner sc = new Scanner(fileI);
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
  
  private static int ingreadsFeilds = 5;
    //Adds the lines to the arraylist
  private static void addIng(String line) {
      int[] comLocations = new int[ingreadsFeilds];
      String temp = line;
      int j = 0;
      
      for(int i = 0; i < ingreadsFeilds -1; i++) {
      while(temp.charAt(0)!=',') {
        temp = temp.substring(1);
        j++;
      }
      j++;
      temp = temp.substring(1);
      comLocations[i] = j;
    }

    // the last substring here needs to go from ingreadsFeild-1
    String name = line.substring(comLocations[0],comLocations[1]-1);
    double amountStock = Double.parseDouble(line.substring(comLocations[1],comLocations[2]-1)); 
    units unitType = units.valueOf(line.substring(comLocations[2],comLocations[3]-1));
    String storage = line.substring(comLocations[3],comLocations[4]-1);
    LocalDate sellBy = LocalDate.parse(line.substring(comLocations[4]));
    
    ingsIn.add(new Ingreadient(name, amountStock, unitType, storage, sellBy));
  }

  //Runner
  public static List<Ingreadient> getIngredients(){
      loadIngreads();
      return ingsIn;
  }
  
    public static void saveIngreadients(List<Ingreadient> list){
    try{
      File daFile = new File(pathFile);
      if (daFile.exists()){
        daFile.delete();
      }
      Ingreadient currentIngreadient;
      FileOutputStream out = new FileOutputStream(pathFile);
      for (int i=0; i<list.size(); i++){
        currentIngreadient = list.get(i);
        String outLine = currentIngreadient.toString();
        out.write(outLine.getBytes());
        out.write('\n');
      }
      out.close();
    } catch (Exception e){
      System.out.println("Error in saving ingreadients list: \n" + e);
    }
  }
}