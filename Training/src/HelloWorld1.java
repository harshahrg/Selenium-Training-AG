import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Hellow World");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar files\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
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
