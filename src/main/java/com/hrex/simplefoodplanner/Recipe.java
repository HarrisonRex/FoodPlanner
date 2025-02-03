package com.hrex.simplefoodplanner;

import java.util.*;
public class Recipe {
  private String name;
  private List<Ingreadient> ingreadients;

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
  


}
