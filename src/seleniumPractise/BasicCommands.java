package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javapractice.Employee;

public class BasicCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Deepika Work\\QATech\\Session Requirements\\Automation Testing Reference\\Setup\\chromedriver_win32_v100\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// to launch chrome browser
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard"); // Open URL
		driver.manage().window().maximize();// window maximize
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");// enter username
		driver.findElement(By.id("txtPassword")).sendKeys("admin123"); // enter password
		driver.findElement(By.id("btnLogin")).click(); // Click on login button
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		driver.findElement(By.id("btnSave")).click();

		// Drop Downs

		WebElement dropdown = driver.findElement(By.id("personal_cmbNation"));
		Select s = new Select(dropdown);
		// s.selectByIndex(10);
		// s.selectByValue("82");
		s.selectByVisibleText("Canadian");
		
		//Navigation Commands
		
		driver.navigate().back(); // one page back
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("www.google.com");
		
		// Basic commands
		
		driver.getCurrentUrl(); // gets the current url to verify
		driver.getPageSource(); // prints the entire page source so try not to print
		driver.getTitle(); // gets page title
		driver.getWindowHandle(); // gets windowhandle id for switching between windows
	
		
		
		
		
		
		
		
	}

}
