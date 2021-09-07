import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium jar files\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		
		String Food="300";
		String Clothing="150";
		String Shelter="10000";
		String Transportation="2000";
		String Health="1000";
		String MonthlyPay="20000";
		String MonthlyOther="5000";
		
		driver.findElement(By.id("food")).sendKeys(Food);
		Thread.sleep(2000);
		driver.findElement(By.id("clothing")).sendKeys(Clothing);
		
		driver.findElement(By.id("shelter")).sendKeys(Shelter);
		
		driver.findElement(By.id("transportation")).sendKeys(Transportation);
		Thread.sleep(2000);
		driver.findElement(By.id("health")).sendKeys(Health);
		driver.findElement(By.id("monthlyPay")).sendKeys(MonthlyPay);
		driver.findElement(By.id("monthlyOther")).sendKeys(MonthlyOther);
		Thread.sleep(2000);
		
		String TmonthExpense=driver.findElement(By.id("totalAnnualExpensesMonthly")).getAttribute("value");
		String TmonthIncome=driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
		
		System.out.println("Total Monthly Expense is :"+TmonthExpense);
		System.out.println("Total Monthly Incom is :"+TmonthIncome);
		
		driver.close();
		
		
		
	}

}
