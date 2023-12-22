package Harshith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Week3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver,chromedriver","C:\\Users\\student\\Music\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		
		WebElement createacc = driver.findElement(By.className("_4jy2"));
		Thread.sleep(2000);
		createacc.click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.click();
		Thread.sleep(1000);
		firstName.sendKeys("Harshith");
		
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.click();
		Thread.sleep(1000);
		lastName.sendKeys("Chintakindi");
		
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.click();
		Thread.sleep(1000);
		email.sendKeys("chintakindibhargav2016@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password_step_input\"]"));
		password.click();
		Thread.sleep(1000);
		password.sendKeys("Idontknow@18");
		
		WebElement conf_email = driver.findElement(By.name("reg_email_confirmation__"));
		conf_email.click();
		Thread.sleep(1000);
		conf_email.sendKeys("chintakindibhargav2016@gmail.com");
		
		Select DB = new Select(driver.findElement(By.name("birthday_day")));
		DB.selectByValue("18");
		
		Thread.sleep(1000);
		
		Select DM = new Select(driver.findElement(By.name("birthday_month")));
		DM.selectByValue("10");
		
		Thread.sleep(1000);
		
		Select DY = new Select(driver.findElement(By.name("birthday_year")));
		DY.selectByValue("2003");
		
		WebElement maleBtn = driver.findElement(By.xpath("(//label[normalize-space()='Male'])[1]"));
		maleBtn.click();
		Thread.sleep(1000);
		
		WebElement SignUp = driver.findElement(By.className("_6wl"));
		Thread.sleep(2000);
		SignUp.click();
		
	}

}
