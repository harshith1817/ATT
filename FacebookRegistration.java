package att;
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
		WebElement createacc = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
		Thread.sleep(2000);
		createacc.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input"));
		Thread.sleep(2000);
		firstName.sendKeys("Harshith");
		WebElement lastName = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input"));
		Thread.sleep(2000);
		lastName.sendKeys("Chintakindi");
		WebElement email = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input"));
		Thread.sleep(2000);
		email.sendKeys("chintakindibhargav2016@gmail.com");
		WebElement password = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input"));
		Thread.sleep(2000);
		password.sendKeys("Idontknow@18");
		WebElement confirmemail = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[3]/div/div/div[1]/input"));
		Thread.sleep(2000);
		confirmemail.sendKeys("chintakindibhargav2016@gmail.com");
		Select DB = new Select(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]")));
		DB.selectByValue("18");
		Thread.sleep(2000);
		Select DM = new Select(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]")));
		DM.selectByValue("10");
		Thread.sleep(2000);
		Select DY = new Select(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]")));
		DY.selectByValue("2003");
		WebElement maleBtn = driver.findElement(By.xpath("(//label[normalize-space()='Male'])[1]"));
		maleBtn.click();
		Thread.sleep(2000);
		WebElement SignUp = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button"));
		Thread.sleep(2000);
		SignUp.click();
	}

}
