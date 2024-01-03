package att;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week4{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\jchan\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.codechef.com/users/cmr_21r01a7219");
		driver.manage().window().maximize();
		List<WebElement> contents = driver.findElements(By.className("content"));
		Thread.sleep(500);
		for(WebElement content : contents) {
			List<WebElement> h5Tag = content.findElements(By.tagName("h5"));
			Thread.sleep(500);
			if(h5Tag.size() != 0) {
				List<WebElement> aTag = content.findElements(By.tagName("a"));
				Thread.sleep(500);
				if(aTag.size() != 0) {
					System.out.println(aTag.get(0).getText());
					Thread.sleep(500);
				}
			}
		}
		
		driver.quit();
	}
}
