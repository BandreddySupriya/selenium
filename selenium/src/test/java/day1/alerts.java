package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[@onClick='alertbox()']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@onClick='confirmbox()']")).click();
		Thread.sleep(5000);
	Alert alert=driver.switchTo().alert();
	//alert.accept();
	//driver.findElement(By.linkText("Alert with OK & Cancel ")).click();
	
	
	alert.dismiss();
		

	}

}
