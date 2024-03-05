package TEST;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

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
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.time.Duration;
      public class hayyak extends BaseTest{
    	  //Tag name //tag name{@atteibute ='value'}- value which is contenent which is after tag name that is after (اول جملة موجوجة بال app source)
    	  //كيف منحول  xpath و and to take the tag name.
      @Test 
      public void rasha() throws InterruptedException{
      driver.findElement(By.id("MyUniqueId123")).click();
      driver.findElement(By.id("input-phoneNumber")).click();
      driver.findElement(By.id("input-phoneNumber")).sendKeys("0776857176");
	  driver.hideKeyboard();
	  driver.findElement(By.id("MyUniqueId123")).click();        
      driver.findElement(By.id("input0")).sendKeys("0");
      driver.findElement(By.id("input1")).sendKeys("0");
      driver.findElement(By.id("input2")).sendKeys("0");
      driver.findElement(By.id("input3")).sendKeys("0");
      driver.findElement(By.id("input4")).sendKeys("0");
      driver.findElement(By.id("input5")).sendKeys("0");

      Thread.sleep(3000);
//      driver.findElement(By.id("MyUniqueId123")).click();
//      driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[1]")).click();
//      driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[1]")).sendKeys("123456");
//Thread.sleep(3000);
//      driver.findElement(By.id("android:id/button1")).click();
//      driver.findElement(By.className("android.widget.ImageView"));
//      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
     
	
	


}
}

