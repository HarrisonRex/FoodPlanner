package com.hrex.simplefoodplanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IngreadientTest {

  private Ingreadient testIng;

  @BeforeEach
  void setUpTests() {//before each test
    testIng = new Ingreadient("test", 69);
  }

  @Test
  void testMakeIngreadient(){ // making a ingreadient object
    testIng = new Ingreadient("test0", 420);
  }

  @Test
  void testGetters() {
    assertEquals("test", testIng.getName());
    assertEquals(420, testIng.getStockAmount());
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
