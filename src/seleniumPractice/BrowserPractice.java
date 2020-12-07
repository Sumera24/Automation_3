package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserPractice {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
     /* System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.amazon.com/");
      driver.manage().window().maximize();*/ 
      
     /* System.setProperty("webdriver.ie.driver","C:\\SeleniumDrivers\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
      WebDriver driver=new InternetExplorerDriver();
      driver.get("https://www.amazon.com/");*/
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumDrivers\\geckodriver-v0.28.0-win64\\geckodriver.exe");
	      WebDriver driver=new FirefoxDriver();
	      driver.get("https://www.amazon.com/");
      
      
	}

}
