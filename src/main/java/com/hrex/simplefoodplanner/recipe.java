package com.hrex.simplefoodplanner;

import java.util.*;
public class Recipe {
  private String name;
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Ingreadient> getIngreadients() {
    return ingreadients;
  }

  public void setIngreadients(List<Ingreadient> ingreadients) {
    this.ingreadients = ingreadients;
  }

  private List<Ingreadient> ingreadients;

  public Recipe(String name){
    this.name = name;
  }
}
