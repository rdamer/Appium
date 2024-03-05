package TEST;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

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
      public class MisceallanousAppiumActions extends BaseTest{
    	  //Tag name //tag name{@atteibute ='value'}- value which is contenent which is after tag name that is after (اول جملة موجوجة بال app source)
    	  //كيف منحول  xpath و and to take the tag name.
    	  //adb shell dumpsys window | find "mCurrentFocu"
    	  //مشان نحدد الactivity ,package name
      @Test 
      public void misceallanous() throws MalformedURLException{
    	  Activity activity=new Activity("io.appium.android.apis", "io.appium.android.apis.preference.PreferenceDependencies");
    	  driver.startActivity(activity);
//      driver.findElement(AppiumBy.accessibilityId("Preference")).click();
//      driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies\']")).click();
      driver.findElement(By.id("android:id/checkbox")).click();
      DeviceRotation landScape=new DeviceRotation(0, 0, 90);
      driver.rotate(landScape);
      
      driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout")).click();
     // driver.findElement(By.xpath("android.widget.RelativeLayout[2]"));
      //حطينا 2 لانو عنا 2  index  نفس الشيء
       //لتحويل ال tag name (اللي موجود بال  app source )مناخده نفسه و منضيف عليه الرقم الليي متكرر
      //for turn the attribute classes to class we will take it and lf there is something similler to each other we will write .get (int ) 
      // و نحط رقم  index  بناءا على اللي بيطلعلنا 
      String actual=driver.findElement(By.id("android:id/alertTitle")).getText();
      Assert.assertEquals(actual, "WiFi settings");
      //clipboard -paste to clipboard مشان النسخ بنقدر نعمل  clipboard 
      driver.setClipboardText("rashaamer");
      //الجماة اللي تحت مباشرة مشان الشيء اللي نسخناه نرجع نعملو بيست بالمكان اللي عملت كوبي منو 
      driver.findElement(AppiumBy.id("android:id/edit")).sendKeys(driver.getClipboardText());
      driver.pressKey(new KeyEvent(AndroidKey.ENTER ));
//       Thread.sleep(3000);
//      driver.findElement(By.id("android:id/edit")).sendKeys("rashaamer");
//      driver.findElement(By.id("android:id/button1")).click();
           driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
//           Thread.sleep(3000);
           driver.pressKey(new KeyEvent(AndroidKey.BACK ));
           driver.pressKey(new KeyEvent(AndroidKey.HOME ));
           
      //ليش  get   عليها wrong
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
	  tearDown();
	
	
	


}
}

