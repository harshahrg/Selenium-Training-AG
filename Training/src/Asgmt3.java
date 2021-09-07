import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asgmt3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chrome.google.com/webstore/category/extensions");
		Thread.sleep(2000);
		
		
		String CTitle=driver.getTitle();
		if (CTitle.contains("Chrome"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
		

	}

}
