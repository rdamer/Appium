package TEST;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class e_Commerce_tc_1 extends BaseTest {
	
	@Test
	public void FillForm() throws InterruptedException {
		//xpath=//tagname[@attribute='value']
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Rasha");
		Thread.sleep(5);
//        driver.pressKey(new KeyEvent(AndroidKey.BACK ));
//		Thread.sleep(5);
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		Thread.sleep(5);
		driver.findElement(By.id("android:id/text1")).click();
		//بدنا نعمل  scrolldown  حتى يلاقي اسم البلد اذا ما كانت مبينة
  	    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Brazil\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Brazil']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
//        String toastvalue=driver.findElement(By.xpath("//android.widget.Toast")).getAttribute("name");
  	    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));
        int list=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
        for (int i=0;i<list;i++)
        {
       String productName= driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
       if (productName.equalsIgnoreCase("Jordan 6 Rings"))
       {
   		driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();   
       }
        }
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
        
       driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        Thread.sleep(3000);
        
        String itemnamesure=driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
        Assert.assertEquals(itemnamesure, "Jordan 6 Rings");
        //شايفة المشكلة اللي كانت عنا بال  cards  مبارح 
        //كيف بدنا نحدد انو تايتل منيح -مناخد id  الخاص فيه -
        //و منعمل يجبلي  text  و منعمل  assert sent
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //بدي اتاكد انو الايتم اللي طلعلي اسمو jorda و لا لا 
        //بدي اعمل جملة  assert - تضمن ما يلي 
//        String itemname= driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
//        Assert.assertEquals(itemname," Jordan 6 Rings");
//		Thread.sleep(5);
//	    Assert.assertEquals(toastvalue, "Please enter your name");
		//any toast into android have this tag name android.widget.Toast
        //lf we have more than one toast - we can add [1] or [2] 
        //we know that we can convert (tag name without attribute or value by "//tagname" and that what we will di it here
        //to have the text into the toast - every toast in andriod have an attribute called name 
		//every toast have an attribute called name -inside the name we will have the massege (value) / we will see the what is written into the toast
		//we have comment sending keys (name) so the error masssege will be shown 
//  	    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Ringss\"));"));
//		driver.findElements(By.)
//  	  ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
//			    "left", 100, "top", 100, "width", 200, "height", 200,
//			    "direction", "down",
//			    "percent", 3.0
//			    ));
//	
		
		
		
		
		
	}
	
	}
