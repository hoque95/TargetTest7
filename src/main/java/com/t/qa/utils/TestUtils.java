package com.t.qa.utils;

import org.openqa.selenium.JavascriptExecutor;
import com.t.qa.base.TestBase;

public class TestUtils extends TestBase{

	
	
	public void frameSwitch() {
		driver.switchTo().frame(0);
	}
	
	public void scrollDown (int wide, int length) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+wide+","+length+")");
	}
	
	


	
}
