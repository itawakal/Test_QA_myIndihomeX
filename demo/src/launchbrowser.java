

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class launchbrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://myih.telkom.co.id/");
		driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/ul/div/li[2]/a")).click();
	}

}
