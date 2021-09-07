import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asgmt4 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		Thread.sleep(2000);
		
		System.out.println("Title :"+driver.getTitle());
		System.out.println("URL :"+driver.getCurrentUrl());
		System.out.println("Page Source :"+driver.getPageSource());
		driver.close();
		
		
	}

}
