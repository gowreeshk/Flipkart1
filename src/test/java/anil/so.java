package anil;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class so {
	
	

		@Test
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91888\\eclipse-workspace\\bye\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		
//		String searchText="";
//		String searchIcon="";
//		String searchSong="";
		
		for (int i = 1; i <= 10; i++) {
		
//			searchText= "//input[@id='search']";
//			searchIcon = "//button[@id='search-icon-legacy']";
//			searchSong = "(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]";
		
		driver.findElement(By.xpath("//input[@id]")).click();
		driver.findElement(By.xpath("//input[@id='search']")).clear();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("rangamma mangamma");
		driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[2]")).click();
		driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
		Thread.sleep(3000);
		while (ElementIsPresent(driver,"//div[text()='Skip Ads']")) {
			
			ElementClick(driver	,"//div[text()='Skip Ads']");
		}
		
		Thread.sleep(300000);
		System.out.println("Loop"+i+" completed");
	}
		driver.close();
}
	
	public static boolean ElementIsPresent(WebDriver driver, String value) {
		
		boolean flag;
		try {
			
			WebDriverWait wait = new WebDriverWait(driver,5);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(value))); 
			driver.findElement(By.xpath(value)).isDisplayed();
			System.out.println("Element is Displayed");
			flag=true;
			
			} catch (Exception e) {
				
				flag=false;
			}	
		return flag;	
	}	
	
	public static boolean ElementClick(WebDriver driver, String xpath) {
		
		boolean flag;
		try {
			
			driver.findElement(By.xpath(xpath)).click();
			flag=true;
			System.out.println("Element Click Working");		
			} catch (Exception e) {				
				flag=false;
			}	
		return flag;
		}
}
