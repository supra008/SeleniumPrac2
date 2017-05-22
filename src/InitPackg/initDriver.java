package InitPackg;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class initDriver {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException{
	
	System.setProperty("webdriver.chrome.driver","D:\\Practice\\SeleniumJars\\chromedriver.exe");
	WebDriver chrmDriver = new ChromeDriver();
	
	chrmDriver.get("https://www.youtube.com/");
	
	chrmDriver.manage().window().maximize();
	
	JavascriptExecutor jsx = (JavascriptExecutor)chrmDriver;
	Thread.sleep(5000);
	jsx.executeScript("window.scrollBy(0,1500)", "");
	Thread.sleep(5000);;
	
	
	jsx.executeScript("window.scrollBy(0,-1500)", "");
	Thread.sleep(5000);
	//System.out.println("Done");
	
	chrmDriver.close();
	

}
	
}
