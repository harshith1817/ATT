package arjun;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class week0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver,chromedriver","C:\\Users\\student\\Music\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		WebElement Login = driver.findElement(By.className("desktop-userTitle"));
		new Actions(driver).moveToElement(Login).perform();
		Thread.sleep(2000);
		WebElement registerBtn = driver.findElement(By.className("desktop-linkButton"));
		registerBtn.click();
		
		WebElement phone_number = driver.findElement(By.className("mobileNumberInput"));
		phone_number.click();
		phone_number.sendKeys("9247191127");
		
		WebElement continueBtn = driver.findElement(By.className("submitBottomOption"));
		continueBtn.click();
		
	}

}
