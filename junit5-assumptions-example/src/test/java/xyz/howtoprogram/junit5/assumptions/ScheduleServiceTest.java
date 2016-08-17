package xyz.howtoprogram.junit5.assumptions;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class ScheduleServiceTest {


  @Test
  public void doScheduleSingleTimeZone() {

    TimeZone tzone = TimeZone.getDefault();
    // Assume that the timezone is US/Mountain
    Assumptions.assumeTrue(tzone.getDisplayName().equals("US/Mountain"));

    // Test doSchedule method
    ScheduleService scheduleService = new ScheduleService();
    assertTrue(scheduleService.doSchedule());

  }

  @Test
  public void doScheduleLocaleNonUS() {

    // Assume that the current locale is US
    Locale currentLocale = Locale.getDefault();
    Assumptions.assumeTrue(currentLocale.equals(Locale.US));

    // Test doSchedule method
    ScheduleService scheduleService = new ScheduleService();
    assertTrue(scheduleService.doSchedule());

  }

  @Test
  public void backupCalendarWindows() {

    Assumptions.assumeTrue(System.getProperty("os.name").startsWith("Windows"));

    // Test doSchedule method
    ScheduleService scheduleService = new ScheduleService();
    assertTrue(scheduleService.backupCalendar());

  }
}
