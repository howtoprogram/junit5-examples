package xyz.howtoprogram.junit5.nested;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.platform.commons.util.StringUtils;

public class UserService {

  public boolean login(String username, String password) {
    if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
      throw new IllegalArgumentException("Username and password must not be null or empty");
    } else if (username.equals("admin") && password.equals("password123")) {
      return true;
    }
    return false;
  }

  public boolean changePassword(long userId, String oldPassword, String newPassword) {
    if (userId == 1 && StringUtils.isNotBlank(newPassword) && StringUtils.isNotBlank(newPassword)
        && !newPassword.equals(oldPassword)) {
      return true;
    }
    return false;
  }

  public boolean resetPassword(long userId) {
    List<Long> existingUsers = new ArrayList<>(Arrays.asList(1L, 2L, 3L));
    if (existingUsers.contains(userId)) {
      return true;
    }
    return false;
  }

  public boolean logout(long userId) {
    List<Long> existingUsers = new ArrayList<>(Arrays.asList(1L, 2L, 3L));
    if (existingUsers.contains(userId)) {
      // do whatever
    }
    return true;
  }


}
