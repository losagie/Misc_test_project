package Selenium_Prj;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class my_seleniumjob {

	public static void main(String[] args) throws IOException { 
		
		//This is a Screenshot capture Utility

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LocalDateTime datetime = LocalDateTime.now();
		String ebayfile = datetime.toString().replace(":"," ").substring(0, 13);
		System.out.println(ebayfile);
		driver.get("https://www.ebay.com/b/Luxury-Watches/31387/bn_36841947");
		driver.manage().window().maximize();
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File((".\\screenshot1\\" + ebayfile + ".png")));
		driver.quit();

	}

}