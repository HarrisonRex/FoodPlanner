package com.hrex.simplefoodplanner.objects;

import java.util.*;
public class Recipe {
  private String name;
  private List<Ingreadient> ingreadients;


  public String toString(){
    return(name+","+ingreadients.toString());
  }

  public Recipe(String name){
    this.name = name;
    this.ingreadients = new ArrayList<Ingreadient>();
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public List<Ingreadient> getIngreadients() {
    return ingreadients;
  }
  public void addIngreadient(Ingreadient ingToAdd){
    ingreadients.add(ingToAdd);
  }

  public void removeIng(int index){
    ingreadients.remove(index);
  }
  public void removeIng(String item){ 
      for(int i=0; i<ingreadients.size(); i++){
        if (ingreadients.get(i).getName().equals(item)) {
          ingreadients.remove(i);
          break;
        }
      }
  }
  


}
