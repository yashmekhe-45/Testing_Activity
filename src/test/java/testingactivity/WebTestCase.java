package testingactivity;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTestCase {

	@Test
	public void testGooglePage() {
		
		String expectedResult = "1. Overview";
		String actualResult = null;
		System.setProperty("webdriver.chrome.driver", "c:\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.junit.org/junit5");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/ul/li[1]/a"));
		actualResult = driver.getTitle();
		System.out.println(actualResult);
		assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void testGooglePageData() {
		
		String expectedResult = "2. Writing Tests";
		String actualResult = null;
		System.setProperty("webdriver.chrome.driver", "c:\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.junit.org/junit5");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/ul/li[2]/a"));
		actualResult = driver.getTitle();
		System.out.println(actualResult);
		assertEquals(actualResult, expectedResult);
	}
}
