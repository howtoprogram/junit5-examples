package xyz.howtoprogram.junit5.suite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.runner.SelectClasses;
import org.junit.runner.RunWith;

import xyz.howtoprogram.junit5.order.TestOrderService;
import xyz.howtoprogram.junit5.payment.TestPaymentService;
import xyz.howtoprogram.junit5.user.TestUserService;

@RunWith(JUnitPlatform.class)
@SelectClasses({TestUserService.class, TestOrderService.class, TestPaymentService.class})
public class PlayOrderFeatureSuite {
}
