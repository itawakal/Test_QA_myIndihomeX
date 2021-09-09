package demo.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class launchbrowser {
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//open web app
		driver.manage().window().maximize();
		driver.get("https://myih.telkom.co.id/");
		String title = driver.getTitle();
		
		if(title.equalsIgnoreCase("IndiHome"))
			System.out.println("title matches");
		else
			System.out.println(title);
		
		
		//locate a web element
		//Searching
		driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/ul/li[1]/div/a")).click();
		Thread.sleep(2000);
		
		String key = "Wifi.id seamless";
		WebElement m = driver.findElement(By.xpath("//input[@class='form-search form-control open-search']"));
		System.out.println("Searching : "+key);
		m.sendKeys(key);
		Thread.sleep(2000);
	    m.sendKeys(Keys.ENTER);
	    Thread.sleep(4000);
	    
	    List<WebElement> allSearchResults = driver.findElements(By.cssSelector("div.card-body-top > div.subheading"));
	    System.out.println("Result : ");
	    for(WebElement eachResult : allSearchResults) {
	        System.out.println(eachResult.getText());
	    }
	    
	    String choice = "2";
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div/section/div/div["+choice+"]/a/div[2]/span")).click();
		
		
	}

}
