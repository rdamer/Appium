package TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class MobileBrowserTest extends BrowserBaseTest {
	@Test
public void browsertest() {
driver.get("http://google.com");	
driver.findElement(By.name("q")).sendKeys("rasha");
driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
	
	
	
	
}
	
	
}
