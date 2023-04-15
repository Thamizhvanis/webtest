package websitecap;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webmain {
	
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://44.204.69.203:49154/wd/hub");
		RemoteWebDriver driver;
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.merge(caps);
		driver = new RemoteWebDriver(url, options);
		
		driver.manage().window().maximize();
		System.out.print("in browser setup");
		Thread.sleep(2000);
		
		String actualtitle = driver.getTitle();
		System.out.println("Search result webpage title: " + actualtitle);
		
		driver.quit();
		
	}
	
}
