package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.UtilClass1;

public class ProductDetails_page extends UtilClass1{
	
	WebDriver driver;
	
	@FindBy(xpath="//button[text()='BUY NOW']")
	private WebElement buyNowButton;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addToCart;
	
	@FindBy(xpath="//span[text()='7,499']")
	private WebElement price;
	
	
	
	public ProductDetails_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public boolean isBuyNowButtonIsAppeared()
	{
		try {
			WebElement element = expliciteWait(driver, buyNowButton);
			
			return true;
		}catch(Exception e)
		
		{
			return false;
		}
	}
	
		public void ProductAddToCart() {
			addToCart.click();
		}	
		
		public void Calculation() {
			
		System.out.println(price.getText());
		}
	

}
