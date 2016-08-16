package xyz.howtoprogram.junit5.order;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class TestOrderService {

  @Test
  public void placeOrderNoItem() {
    assertEquals(1, 1);
  }
}
