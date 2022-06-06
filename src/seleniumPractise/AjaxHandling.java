package seleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjaxHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Deepika Work\\QATech\\Session Requirements\\Automation Testing Reference\\Setup\\chromedriver_win32_v100\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// to launch chrome browser
		driver.get("https://www.google.com/"); // Open
		driver.manage().window().maximize();// window maximize
		driver.findElement(By.name("q")).sendKeys("a"); // Type "a" in search box

		String xpath1 = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[";
		String xpath2 = "]";

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/*
		 * driver.findElement( By.xpath(
		 * "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[4]"
		 * )) .click();
		 */

		for (int i = 1; i <= 10; i++) {

			String actual = driver.findElement(By.xpath(xpath1 + i + xpath2)).getText();
			String expected = "amazon india";
			if (actual.equalsIgnoreCase(expected)) {
				driver.findElement(By.xpath(xpath1 + i + xpath2)).click();
			}

		}

	}

}
