package Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Popupwindow {
	
	public WebDriver driver;
	
  @Test
  public void windowhandle() throws Exception {
	  
	  //click on new separate window
	  driver.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
	  Thread.sleep(2000);
	  
	  //click on click button
	  driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	  Thread.sleep(2000);
	  
	//Parent window handling
	  String backtoparentwindow =driver.getWindowHandle();
	  Thread.sleep(2000);
	  
	  //handling child window
	  for(String childwindowhandle :driver.getWindowHandles()){
		  
		  //switchto child window
		  driver.switchTo().window(childwindowhandle);
		  Thread.sleep(3000);
	  }
	  
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  //click on blog button
	  driver.findElement(By.xpath("//span[normalize-space()='Blog']")).click();
	  Thread.sleep(2000);
	  
	  //child window close
	  driver.close();
	  Thread.sleep(3000);
	  
	  
	  //again switch to focus on parent window
	  driver.switchTo().window(backtoparentwindow);
	  Thread.sleep(6000);
	  
	  //click on home button
	  driver.findElement(By.linkText("Home")).click();
	  
	    
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.get("http://demo.automationtesting.in/Windows.html");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
