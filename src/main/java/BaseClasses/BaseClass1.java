package BaseClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	
	public static WebDriver getDriver()
	{
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Browsers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
//		WebDriver driver = null;
//		
//		if(browser.equals("chrome"))
//		{
//			WebDriverManager.chromedriver().setup();
//			//System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Browsers\\chromedriver.exe");
//			driver = new ChromeDriver();
//		}else if(browser.equals("firefox"))
//		{
//			WebDriverManager.firefoxdriver().setup();
//			//System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\Browsers\\geckodriver.exe");
//			driver = new FirefoxDriver();
//		}
	
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		return driver;
		
	}

}
