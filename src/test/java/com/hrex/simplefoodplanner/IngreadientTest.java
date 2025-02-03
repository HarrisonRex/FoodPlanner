package com.hrex.simplefoodplanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IngreadientTest {

  private Ingreadient testIng;

  @BeforeEach
  void setUpTests() {//before each test
    testIng = new Ingreadient(true,"test", 69);
  }

  @Test
  void testMakeIngreadient(){ // making a ingreadient object
    testIng = new Ingreadient(true,"test0", 420);
  }

  @Test
  void testGetters() {
    //assert all getters to test ob
  }

  
  @Test
  void testSetters() {
    //assert all setters to test ob
  }

  @Test
  void testToString() {
    //asserst to the test ob
  }
}
