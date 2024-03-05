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
      public class longpress extends BaseTest{
    	  //Tag name //tag name{@atteibute ='value'}
    	  //كيف منحول  xpath و and to take the tag name.
      @Test 
      public void longpressGesture() throws MalformedURLException, InterruptedException{
    	  
    	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
//    	  driver.findElement(AppiumBy.accessibilityId("//android.widget.TextView[@text='Expandable Lists']")).click();
    	  driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
    	  driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
          WebElement ele=driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
       
    	  ((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
    			  ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
    			  "duration",2000));
    	  Thread.sleep(2000);
         String actual = driver.findElement(By.id("android:id/title")).getText();
         Assert.assertEquals(actual, "Sample menu");
         Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
         //بدنا ننتبه اذا معروض او لأ او  is display 
         // و اذا بدنا نجيب  text  او ل  
    	  
//	  tearDown();
}
}

