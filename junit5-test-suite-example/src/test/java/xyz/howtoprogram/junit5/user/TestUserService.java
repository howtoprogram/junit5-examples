package xyz.howtoprogram.junit5.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class TestUserService {

  @Test
  public void loginCorrectUsernameAndPassword() {
    assertEquals(1, 1);
  }

}
