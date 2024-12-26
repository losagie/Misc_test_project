package Selenium_Prj;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_maven_project2 {

	public static void main(String[] args) {
		
		// This code demonstrates how to switch windows/tabs will performing UI automation test
		
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
				driver.get("https://yahoo.com/");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("Manchester United");
				driver.findElement(By.xpath("//button[@id='ybar-search']")).click();
				driver.navigate().to("https://trustedinstitute.com/");
				Set<String>  Winone = driver.getWindowHandles();
				System.out.println(Winone.size());
				Iterator <String> Iter = Winone.iterator();
			    String FirstWind = Iter.next();
			    String SecondWind = Iter.next();
			    driver.switchTo().window(SecondWind);
			    driver.findElement(By.linkText("Images")).click();
			    driver.quit();

		
			}

}
