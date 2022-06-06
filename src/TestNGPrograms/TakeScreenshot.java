package TestNGPrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TakeScreenshot {
	// for downloading apache.commons.io files
	// https://commons.apache.org/proper/commons-io/download_io.cgi

	WebDriver driver = null;
	int num;

	@Test
	public void takeScreenshot() throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("D:\\Deepika Work\\QATech\\Online Classes\\Mital Patel\\flipkartscreenshot.jpg");
		FileUtils.copyFile(src, dst);
	}

	@BeforeClass
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Deepika Work\\QATech\\Session Requirements\\Automation Testing Reference\\Setup\\chromedriver_win32_v100\\chromedriver.exe");
		driver = new ChromeDriver();// to launch chrome browser

	}

	@BeforeMethod

	public void LaunchURL() {
		driver.get("https://www.flipkart.com/"); // Open
		driver.manage().window().maximize();// window maximize

	}

	@AfterMethod

	public void CloseUrl() {
		driver.close();
	}

	@AfterClass

	public void CloseBrowser() {
		driver.quit();
	}

}
