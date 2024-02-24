package Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class InforamtionCommands {
	
	public WebDriver driver;
	
  @Test (priority = 1)
  public void gmail() {
	  
	  String str1 = driver.findElement(By.linkText("Gmail")).getText();
	  System.out.println(str1);
  }
	  @Test (priority = 2)
	  public void google_image() {
		  
		 String str2= driver.findElement(By.xpath("//img[@alt='Google']")).getAttribute("alt");
	  System.out.println(str2);
	    
  }
	  @Test (priority = 3)
	  public void search_button(){
		  
		  String str3 = driver.findElement(By.name("btnK")).getAttribute("value");
		  
		  System.out.println(str3);
		  
	  }
	  
	  
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.get("http://google.com");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
