package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"D:\\Deepika Work\\QATech\\Session Requirements\\Automation Testing Reference\\Setup\\chromedriver_win32_v100\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// to launch chrome browser
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard"); // Open URL
		driver.manage().window().maximize();// window maximize
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");// enter username
		driver.findElement(By.id("txtPassword")).sendKeys("admin123"); // enter password
		driver.findElement(By.id("btnLogin")).click(); // Click on login button
		
	}

}
