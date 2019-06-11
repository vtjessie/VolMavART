package volnay.Test;

import org.testng.annotations.Test;

import volMain.Util;
import volnay.PageFactory.AddEventPage;

//import volnay.Test.AddEventFields;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AddEventTest {
	WebDriver  driver ;
	AddEventPage eventPage = new AddEventPage(driver);
// @Test(dataProvider = "dp")
  public void addEventVerify(AddEventFields inputs) {
	  

 //   eventPage.enterDate("05/11/2020");
 //  Assert.assertTrue(Util.checkDatePattern(dateEntered) , "TRUE");
    
 //   eventPage.enterTime("10:10:10");
    
  //  eventPage.enterTitle("BirthDay");
	 eventPage.addEventData(inputs);
  }

  @DataProvider
  public Object[][] dp() {
   return new Object[][] {
   	new Object[]  { 
       		    "10/10/10","10:10AM", "infant","derrick",
       	"gnanasusairaj","@gmail","com", "Gnanasusairaj123","test" 
       }
        
     
   };
 }

  @BeforeTest
  void launchBrowser() {
  driver = Util.setChromedriver();
 driver.get("http://volnay.netlify.com/organ-volnay/profile.html");
// driver.manage().window().maximize();
 
  }

  @AfterTest
  public void afterTest() {
  }

  
  
}
