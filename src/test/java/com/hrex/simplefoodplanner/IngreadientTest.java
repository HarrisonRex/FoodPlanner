package com.hrex.simplefoodplanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.Calendar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.hrex.simplefoodplanner.etc.units;

public class IngreadientTest {

  private Ingreadient testIng;
  private LocalDate willy = LocalDate.now();

  @BeforeEach
  void setUpTests() {//before each test
    testIng = new Ingreadient("test", 69, units.g, "Cumboard",1);
  }

  @Test
  void testMakeIngreadient(){ // making a ingreadient object
    testIng = new Ingreadient("test0", 420, units.ml, "Fridge", willy);
  }

  @Test
  void testGettersAndSetters() {
    
    LocalDate testDate = LocalDate.of(2002, 12, 8);

    testIng.setName("testSet");
    testIng.setStockAmount(4);
    testIng.setUnitType(units.l);
    testIng.setStorageLocation("FishTank");
    testIng.setSellBy(testDate);
    assertEquals("testSet", testIng.getName());
    assertEquals(4, testIng.getStockAmount());
    assertEquals(units.l, testIng.getUnit());
    assertEquals("FishTank", testIng.getLocation());
  }
  @Test
  void testToString() {
    assertEquals("test"+","+69.0+",g"+",Cumboard,"+willy.plusDays(1), testIng.toString());
  }

  
}
