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
      public class scrolldown extends BaseTest{
    	  //Tag name //tag name{@atteibute ='value'}
    	  //كيف منحول  xpath و and to take the tag name.
      @Test 
      public void Scrolldownfeature() throws MalformedURLException, InterruptedException {
//في عنا طريقتين لحتى نعمل ال scroll 
    	  //the first is from githup like longpress 
    	  //other 
//    	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
//    	  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
//          Thread.sleep(2000);
//     
    	  driver.findElement(AppiumBy.accessibilityId("Graphics")).click();
//    	  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Touch Paint\"));"));
//ناتباه رشا لازم لما بنحط الكلمة اللي بدو يوصل عنها بالسكرول يكون حاطين سلاش قبل "و وواحدة بعدها 
    	  boolean canScrollMore;
    	   canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
    			    "left", 100, "top", 100, "width", 200, "height", 200,
    			    "direction", "down",
    			    "percent", 3.0
    			));
     
      while(canScrollMore);
              Thread.sleep(2000);
    	  
//	  tearDown();
}
}
