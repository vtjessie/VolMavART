package volPack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class VolUserAdd {
	public static WebDriver driver;

  @Test
  public void userAdd() throws InterruptedException {
	  System.out.println("Ave... Maria");
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("password")).clear();
	  driver.findElement(By.id("email")).sendKeys("vt.jessie@gmail.com");
	  driver.findElement(By.id("password")).clear();
	  driver.findElement(By.id("password")).sendKeys("Divine123");
	  driver.findElement(By.className("login100-form-btn")).click();
	  Thread.sleep(3000);
//	  driver.findElement(By.id("infotab")).click();
  }
  @BeforeTest
  public void beforeTest() {
		driver = Util.setgecodriver();
		driver.get(Util.BASE_URL);
  }

  @AfterTest
  public void afterTest() {
  }

}
