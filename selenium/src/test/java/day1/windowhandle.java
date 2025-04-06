package day1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//click on child window button from main window
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		//get handles of windows
		String mainwindowhandle=driver.getWindowHandle();
		System.out.println(mainwindowhandle);
		Set<String> allwidowhandles=driver.getWindowHandles();
		for(String windowhandle:allwidowhandles) {
			if(!windowhandle.equals(mainwindowhandle)) {
				driver.switchTo().window(windowhandle);
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//a[text()='Access all our Courses']")).click();
				
				
			}
		}
		

	}

}
