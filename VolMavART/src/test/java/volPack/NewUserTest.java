package volPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NewUserTest {
	
	public static WebDriver driver;

  @Test
  public void userAdd() {
	  driver.findElement(By.id("adminAction")).click();
  }
}
