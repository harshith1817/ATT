package arjun;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Week8a {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromeDriver","C:\\Users\\student\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(2000);
//		Action builder=new Action(driver);
		Actions builder =new Actions(driver);
//		WebElement customerLogin=driver.findElement(By.xpath("(//a[normalize-space()='customer login'])[2]"));
//		builder.moveToElement(customerLogin).perform();
		WebElement customerLogin=driver.findElement(By.xpath("(//a[normalize-space()='Customer Login'])[2]"));
		builder.moveToElement(customerLogin).perform();
		Thread.sleep(200);
		WebElement register=driver.findElement(By.xpath("(//a[normalize-space()='Register'])[2]"));
		register.click();
		Thread.sleep(200);
		WebElement firstName=driver.findElement(By.id("acc_first_name"));
		firstName.sendKeys("solomon");
		Thread.sleep(200);
		WebElement lastName=driver.findElement(By.id("acc_last_name"));
		lastName.sendKeys("bye");
		Thread.sleep(200);
		WebElement emailid=driver.findElement(By.id("acc_user_email"));
		emailid.sendKeys("solomanbye@gamil.com");
		Thread.sleep(200);
		WebElement setpassword=driver.findElement(By.id("acc_user_password"));
		setpassword.sendKeys("heavydriver");
		Thread.sleep(200);
		WebElement confirmpassword=driver.findElement(By.id("acc_user_passconf"));
		confirmpassword.sendKeys("heavydriver");
		Thread.sleep(200);
		WebElement mobilenumber=driver.findElement(By.id("acc_mobile_no"));
		mobilenumber.sendKeys("100001");
		Thread.sleep(200);
		WebElement registerBtn=driver.findElement(By.xpath("(//button[normalize-space()='Register']"));
		registerBtn.click();
		Thread.sleep(100);
	}
}
