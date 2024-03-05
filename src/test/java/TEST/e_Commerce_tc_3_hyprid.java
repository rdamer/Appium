package TEST;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class e_Commerce_tc_3_hyprid extends BaseTest {
	
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
//  	    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));
        driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
        driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
        List <WebElement> productprice=driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
        int count = productprice.size();
        double totalsum=0;
        for(int i=0;i<count;i++)
        	
        {
        
        	String amountprice = productprice.get(i).getText();
        	Double price = Double.parseDouble(amountprice.substring(1));
        	totalsum=totalsum+price;
        }  
        	String displaysum = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
        	double totalprice = getFormattedAmount(displaysum);
            Assert.assertEquals(totalsum, totalprice);
            
            WebElement ele=driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
            longpressAction(ele);
            driver.findElement(By.id("android:id/button1")).click();
            driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
            driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
            Thread.sleep(6000);
            
            //Hybrid-mean having both Andriod native and Webbrowser
            //we have to get the contexet 
            Set <String> context=driver.getContextHandles();
            for (String contextName:context)
            {
            System.out.println(contextName);
            }
            
            driver.context("WEBVIEW_com.androidsample.generalstore");
            //here we are in browser level -we have to think as web automation and we can get locaters for the browser itself
            //in google there is a lot of locater with name ( speacilly q) and we can use it becuase we are in the level of browser
            driver.findElement(By.name("q")).sendKeys("rasha");
            driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
            //but when we wont to press any button into the mobile we need to think about appium keys that we have talk about it 
            driver.pressKey(new KeyEvent(AndroidKey.BACK ));
            driver.context("NATIVE_APP");
        }
        	
}