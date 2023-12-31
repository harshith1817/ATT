package att;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Week5 {
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "C:\\Users\\chint\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://cmritautonomous.org/beeserp/Login.aspx");
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/div[1]/div[2]/div/div[2]/input"));
		username.sendKeys("21R01A7219P");
		Thread.sleep(2000);
		WebElement next=driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/div[1]/div[2]/div/div[4]/input"));
		next.click();
		WebElement password=driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/div[1]/div[2]/div/div[3]/input"));
		password.sendKeys("21R01A7219P");
		Thread.sleep(2000);
		WebElement submit=driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/div[1]/div[2]/div/div[5]/input"));
		submit.click();
	}
}
