package Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class MouseoverActions {
	public WebDriver driver;
	public Actions action;
	
  @Test
  public void Mouseover() throws Exception {
	  
	  action=new Actions(driver);
	  
	  WebElement ele1 = driver.findElement(By.linkText("SwitchTo"));
	  Thread.sleep(3000);
	  
	  //action command
	  action.moveToElement(ele1).build().perform();
	  
	  driver.findElement(By.linkText("Windows")).click();
	  Thread.sleep(3000);
	  
	
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("http://demo.automationtesting.in/Register.html");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
