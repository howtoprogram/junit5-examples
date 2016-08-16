package xyz.howtoprogram.junit5.payment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class TestPaymentService {
  @Test
  public void doPaymentZeroAmount() {
    assertEquals(1, 1);
  }
}
