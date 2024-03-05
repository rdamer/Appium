package TEST;

import java.io.File;
//import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
//import java.time.Duration;
import java.time.Duration;

//import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
//import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

public class BaseTest {
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	@BeforeClass
	public void ConfiguerAppium() throws MalformedURLException {
		
//		 service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\My Laptop\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build(); 	
//		        service.start();
		

//         service = new AppiumServiceBuilder()
//	    .withAppiumJS(new File("C:\\Users\\My Laptop\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
// 	    .withIPAddress("127.0.0.1")
// 	    .usingPort(4723)
//// 	    .withTimeout(Duration.ofSeconds(5000))
// 	    .build();
// 	    service.start();
		
		UiAutomator2Options options = new UiAutomator2Options();
	    options.setDeviceName("Rasha");
	    options.setChromedriverExecutable("C:\\Users\\My Laptop\\Downloads\\chromedriver_win32");
//	    options.setApp("C:\\Users\\My Laptop\\eclipse-workspace\\Appium\\src\\test\\java\\resource\\ApiDemos-debug.apk");
	    options.setApp("C:\\Users\\My Laptop\\eclipse-workspace\\Appium\\src\\test\\java\\resource\\General-Store.apk");

	     driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}  
	     public Double getFormattedAmount(String amount) {
	    	    double price = Double.parseDouble(amount.substring(1));
	    	    return price ;
	}
	     public void longpressAction(WebElement ele) {
	    	 ((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
	    			  ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
	    			  "duration",2000));
	     }
	     
	     
	   
	     
	     
	     
	@AfterClass
	public void tearDown()
	{
	    driver.quit();
//		service.stop();	
	}
	}  
