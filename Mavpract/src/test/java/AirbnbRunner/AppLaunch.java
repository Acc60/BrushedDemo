package AirbnbRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppLaunch {
	
	//public static void Main(String[]Args) {
	String url="www.google.com";
	
	public void laun() throws InterruptedException {

 WebDriver driver= WebDriverManager.chromedriver().create();
 System.out.println("before browser launcg");
 driver.get(url);
 System.out.println("After browser launcg");
	}
 
}
