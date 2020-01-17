package Assignment.tFramework;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import cucumber.api.java.en.Then;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class TekSystem {
    
	
	public WebDriver driver;
	public String url="https://rb-shoe-store.herokuapp.com/";
	
	
	@BeforeTest
	public void setUp() throws InterruptedException{
		  
			   System.setProperty("webdriver.chrome.driver", "/Users/fatemaislam/Downloads/chromedriver"); 
		 	   driver=new ChromeDriver();
		 	   driver.get(url);
		 	   driver.manage().window().maximize();
		   }
	
  @Test
  public void searchText() throws InterruptedException {
	 
		WebElement searchTextBox=driver.findElement(By.xpath("//select[@id='brand']"));
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.click(searchTextBox).click();
		Thread.sleep(3000);
  }
  @Test
  public void selectText() throws InterruptedException {
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='brand']")));
		dropdown.selectByVisibleText("Acorn");
		
    
  }
  @Test
  public void clickOnSearch() throws InterruptedException {
	  WebElement searchBox=driver.findElement(By.xpath("//input[@id='search_button']")); 
	    Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.doubleClick(searchBox).click();
		Thread.sleep(3000);
	
  }
 

    @AfterTest
     public void tearDown() {
	 //driver.close(); 
	  System.out.println("Test done");
  }
}
