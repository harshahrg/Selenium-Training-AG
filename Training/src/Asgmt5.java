import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Asgmt5 {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar files\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		driver.findElement(By.xpath("\\span[@class='nav-action-inner']")).click();
		
		
		
		
		
		 
	}

}
