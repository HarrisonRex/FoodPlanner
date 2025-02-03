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
  void testGettersAndSetters() {
    testIng.setName("testSet");
    testIng.setStockAmount(4);
    assertEquals("testSet", testIng.getName());
    assertEquals(4, testIng.getStockAmount());
  }
  @Test
  void testToString() {
    assertEquals("test"+","+69.0, testIng.toString());
  }

  
}
