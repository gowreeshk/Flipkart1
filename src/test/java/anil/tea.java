package anil;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tea 
{
	
 String browsername;

	public static void main(String[] args)
	{
		
		reo();
	}
	
	public static void reo ()
	{
        Scanner input=new Scanner(System.in);
		
		System.out.println("enter the browser name");
		
		String browsername=input.next();
		
		WebDriver driver;
		
		switch (browsername) {
		case "chrome":
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91888\\Desktop\\drivers\\browser drivers\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			break;

		default:
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\91888\\eclipse-workspace\\bye\\drivers\\geckodriver.exe");
			
			driver=new FirefoxDriver();
			
			driver.get("https://www.facebook.com/");
//			driver.quit();
			
			break;
		}
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Simlara");
		
		
	}
		
		

}
