package com.howtoprogram.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.WARN)
public class UserServiceTest {

	@Mock
	UserManager userManager;

	@Test
	public void testSaveArgMatch() throws Exception {
		final String name = "Carbery";
		UserService userService = new UserService(userManager);
		userService.save(name);
		Mockito.verify(userManager, Mockito.times(1)).save(Mockito.anyString());
		Mockito.verify(userManager, Mockito.times(1)).save(Mockito.isA(String.class));
		Mockito.verify(userManager, Mockito.times(1)).save(Mockito.startsWith("Ca"));
		Mockito.verify(userManager, Mockito.times(1)).save(Mockito.endsWith("ry"));
	}

}