package com.tecsup.lab8.test;

import org.junit.Assert;
import org.junit.Test;

import com.tecsup.lab8.main.App;


public class AppTest {

	@Test
	public void testApp() {
		App appObject = new App();
		Assert.assertEquals(appObject.reverseString("Test!"), "!tseT");
	}

}
