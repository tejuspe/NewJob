package smallone;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipset\\Locators\\backpack\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		String a = driver.getWindowHandle();
		System.out.println(a);
	    driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
	    Set<String> b = driver.getWindowHandles();
	    
	    for(String c:b)
	    {
	    	System.out.println(c);
	    	if(!c.equals(a))
	    	{
	    		driver.switchTo().window(c);
	    		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Tej");
	    		Thread.sleep(1000);
	    		driver.close();
	    		}
	    }
	    
	    driver.switchTo().window(a);
	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Aeroplane");
	    Thread.sleep(1000);
	    driver.quit();

	    
	}

}
