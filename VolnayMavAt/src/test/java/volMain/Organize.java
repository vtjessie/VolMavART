package volMain;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Organize {
  public static WebDriver driver;

   
 //(enabled=false )
 //@Test(dataProvider = "dp",enabled=false )
 public void f(String n, String s) {
	  driver.findElement(By.id("username")).sendKeys(n);
	  driver.findElement(By.id("password")).sendKeys(s);
	  driver.findElement(By.xpath("*//*[@class='login100-form-btn']")).click();
	  
 }

 @DataProvider
 public Object[][] dp() {
   return new Object[][] {
     new Object[] { "infant.derrick.gnanasusairaj@gmail.com", "Gnanasusairaj123" },
  //   new Object[] { 2, "b" },
   };
 }
 //@Test(priority=1)
 public void orga() throws InterruptedException {
	 String volnay = driver.findElement(By.id("organName")).getText();
	 try {
	 	 AssertJUnit.assertEquals(volnay, "ACTON BOXBOROUGH COMMUNITY" );
	//	 AssertJUnit.assertEquals(volnay, "VOLNAY" );

     }catch (Exception e){
	      e.printStackTrace();
	      
   
    }  
	 /*	 String organize =  driver.findElement(By.xpath("*//*[@id='organName'][h1]")).getText();
	 try {
		 Assert.assertTrue(organize.contains("  Organize events " ));
		 //	//  Assert.assertTrue(reviewAct.contains(reviewExp),"Yes it is FOUND");


     }catch (Exception e){
	      e.printStackTrace();
	      
   
    } */
	 Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='mainAddEvent']")).click();
 }
//  @BeforeTest 
  void launchBrowser() {

 driver = Util.setChromedriver();
 driver.get(Util.BASE_URL2);
// driver.manage().window().maximize();
 } 
//  @AfterTest
  public void afterTest() {
  }

}
