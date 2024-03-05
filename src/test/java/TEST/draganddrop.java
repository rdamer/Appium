package TEST;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

//import io.appium.java_client.AppiumBy;
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.options.UiAutomator2Options;
//import io.appium.java_client.service.local.AppiumDriverLocalService;
//import io.appium.java_client.service.local.AppiumServiceBuilder;

//import java.io.File;
//import io.appium.java_client.remote.MobilePlatform;
//import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
//import java.net.URL;
//import java.time.Duration;
      public class draganddrop extends BaseTest{
    	  //Tag name //tag name{@atteibute ='value'}
    	  //كيف منحول  xpath و and to take the tag name.
      @Test 
      public void draganddrop() throws MalformedURLException, InterruptedException {
    	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
    	    Thread.sleep(5000);

      driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();;
      WebElement source=driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
      
      ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
    		    "elementId", ((RemoteWebElement) source).getId(),
    		    "endX", 614,
    		    "endY", 558
    		));
      
    Thread.sleep(5000);
        String result=driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
        	Assert.assertEquals(result, "Dropped!");

      
      
      
      
      
      
      
    	  
//	  tearDown();
}
}
