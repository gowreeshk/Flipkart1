package anil;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browsers {

	
	
	
	public static void main(String[] args) 
	{
		System.out.println("Enter The Browser Name");
		
		
		Scanner ch=new Scanner(System.in);
		String browserName = ch.next();
		reUsable(browserName);
	}
		
	public static void reUsable(String browser) 
	{
		
			switch (browser) 
			{
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\91888\\Desktop\\drivers\\browser drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.flipkart.com/");
				
				break;
				
			case "ff":
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\91888\\Desktop\\drivers\\browser drivers\\geckodriver.exe");
				WebDriver driver1=new FirefoxDriver();
				driver1.get("https://www.flipkart.com/");
				break;
				
			default:
				System.out.println("Please Enter valid browsername i.e either Chrome or Firefox");
				break;
				
			}
	}

}
