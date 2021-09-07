import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Asgmt1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Hellow World");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium jar files\\geckodriver.exe");	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.linkedin.com/login");
		Thread.sleep(5000);
		String HTitle=driver.getTitle();
		if(HTitle.contains("Facebook"))
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
