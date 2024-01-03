package att;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Week7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chromedriver", "C:\\Users\\chint\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("CMRIT");
        searchBox.submit();
        Thread.sleep(5000);
        driver.quit();
    }
}
