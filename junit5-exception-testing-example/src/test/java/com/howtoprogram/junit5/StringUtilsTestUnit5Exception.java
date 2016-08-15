package com.howtoprogram.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.expectThrows;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)

public class StringUtilsTestUnit5Exception {


  @Test
  public void convertToIntNullParameterAssertThrows() {
    String st = null;
    assertThrows(IllegalArgumentException.class, () -> {
      StringUtils.convertToInt(st);
    });

  }

  @Test
  public void convertToIntNullParameterExpectThrows() {
    String st = null;
    Throwable exception = expectThrows(IllegalArgumentException.class, () -> {
      StringUtils.convertToInt(st);
    });
    assertEquals("String must be not null or empty", exception.getMessage());
  }

  @Test
  public void convertToIntNullParameterTryCatchIdiom() {
    String st = null;
    try {
      StringUtils.convertToInt(st);
      fail("Expected an IllegalArgumentException to be thrown");
    } catch (IllegalArgumentException e) {
      assertEquals("String must be not null or empty", e.getMessage());
    }
  }

}
