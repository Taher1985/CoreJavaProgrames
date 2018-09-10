package urltest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login1 {

	/**
	 * @param <WebDriver>
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/Software/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://10.159.37.90:9084/wma/login.jsf");
		driver.manage().window().maximize();
		driver.findElement(By.id("mainform:userId")).sendKeys("tali20");
		driver.findElement(By.id("mainform:userPassword")).sendKeys("pano");
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.findElement(By.id("mainform:loginAction")).click();
		driver.findElement(By.xpath(".//*[@id='mainform:clientRequestMasterId']")).sendKeys("       C1053352");
		driver.findElement(By.xpath(".//*[@id='mainform:searchButton']")).click();
		driver.close();
	}

}
