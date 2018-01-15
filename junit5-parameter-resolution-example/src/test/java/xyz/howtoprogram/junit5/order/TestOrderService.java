package xyz.howtoprogram.junit5.order;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ReportAnnotationParameterResolver.class)
@ExtendWith(AuditServiceParameterResolver.class)
// @ExtendWith(EnvironmentNameParameterResolver.class)
public class TestOrderService {

  @DisplayName("Test placeOrder method")
  @Test
  public void placeOrderOK(TestInfo testInfo, TestReporter testReporter) {

    assertEquals("Test placeOrder method", testInfo.getDisplayName());
    testReporter.publishEntry("key", "value");

    assertEquals(1, 1);
  }

  @Test
  public void placeOrderNoItem(AuditService auditService) {
    auditService.audit();
    assertEquals(1, 1);
  }

  @Test
  public void placeOrderNG(@Report ReportService reportService) {
    reportService.report();
    assertEquals(1, 1);
  }

  // @Test
  public void placeOrderNotLogin(EnvironmentInfo environmentInfo) {
    System.out.println(environmentInfo.getOS());
    assertEquals("Windows 10", environmentInfo.getOS());
    assertEquals(1, 1);
  }

}
