package xyz.howtoprogram.junit5.suite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("xyz.howtoprogram.junit5.user")
public class UserFeatureSuite {
}
