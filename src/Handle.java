import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();

	}

}
