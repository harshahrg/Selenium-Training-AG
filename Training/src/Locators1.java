import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar files\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.mortgagecalculator.org/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("homeval")).sendKeys("3000");
		Thread.sleep(2000);
		driver.findElement(By.id("downpayment")).sendKeys("200");
		Thread.sleep(2000);
		driver.findElement(By.id("intrstsrate")).sendKeys("5.6");
		Thread.sleep(2000);
		driver.findElement(By.name("cal")).click();
		Thread.sleep(5000);
		String Mpay=driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[2]/div/div[1]/div[1]/h3")).getText();
		if(Mpay.equals("300 USD"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail : Montly Payment is"+Mpay);
		}
		
		driver.close();
	}

}
