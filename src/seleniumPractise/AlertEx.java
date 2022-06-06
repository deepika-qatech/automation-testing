package seleniumPractise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Deepika Work\\QATech\\Session Requirements\\Automation Testing Reference\\Setup\\chromedriver_win32_v100\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// to launch chrome browser
		driver.get(
				"file:///D:/Deepika%20Work/QATech/Session%20Requirements/Automation%20Testing%20Reference/WebDriver/AlertSample/SimpleAlert.html"); // Open
		driver.manage().window().maximize();// window maximize	
		driver.findElement(By.xpath("/html/body/fieldset/button")).click();
		
		Alert movetoalert = driver.switchTo().alert();
		movetoalert.accept(); // click on ok
		driver.close();

	}

}
