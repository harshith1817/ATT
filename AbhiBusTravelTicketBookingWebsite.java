package arjun;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class facebook {
	public static void main(String[] args) throws InterruptedException, AWTException {
		HashMap<String, Object>prefs=new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications",1);
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		System.setProperty("webdriver.chrome.driver&quot","D:\\DeekshithATT\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		Thread.sleep(2000);
		WebElement from=driver.findElement(By.xpath("/html/body/main/div[1]/div[1]/div[2]/div/div[1]/div/div/div/div/div[2]/input"));
		from.sendKeys("Hyderabad");
		Thread.sleep(2000);
		Robot robot=new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		WebElement to=driver.findElement(By.xpath("/html/body/main/div[1]/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/input"));
		to.sendKeys("Chennai");
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		WebElement date=driver.findElement(By.xpath("/html/body/main/div[1]/div[1]/div[2]/div/div[4]/div/div/div/div[2]/input"));
		date.click();
		Thread.sleep(2000);
		WebElement calender=driver.findElement(By.xpath("/html/body/main/div[1]/div[1]/div[2]/div/div[4]/div/div[2]/div[2]/span[38]"));
		calender.click();
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("/html/body/main/div[1]/div[1]/div[2]/div/div[5]/a"));
		search.click();
		Thread.sleep(2000);
		WebElement viewseats=driver.findElement(By.xpath("//*[@id=\"service-operator-select-seat-1807413731\"]/button"));
		viewseats.click();
		Thread.sleep(2000);
		WebElement seatselect=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[2]/div[3]/div[2]/div[2]/div/div/div[3]/div[1]/div/div[1]/table/tbody/tr[1]/td[6]/div/button"));
		seatselect.click();
		Thread.sleep(2000);
		WebElement boardingpoint=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[2]/div[3]/div[2]/div[2]/div/div/div[3]/div[2]/div/div/div[1]/div/div[2]/div[1]/div[1]/div/label/div"));
		boardingpoint.click();
		Thread.sleep(2000);
		WebElement dropingpoint=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[2]/div[3]/div[2]/div[2]/div/div/div[3]/div[2]/div/div/div[1]/div[2]/div[2]/div[1]/div[1]/div/label"));
		dropingpoint.click();
		Thread.sleep(2000);
		WebElement continuebtn=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[2]/div[3]/div[2]/div[2]/div/div/div[3]/div[2]/div/div/button"));
		continuebtn.click();
		Thread.sleep(2000);
		WebElement skipbtn=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div/div[2]/a"));
		skipbtn.click();
		Thread.sleep(2000);
		WebElement pop=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/span ,"));
		pop.click();
	}
}
