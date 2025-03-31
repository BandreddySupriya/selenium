package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		action.clickAndHold(driver.findElement(By.id("column-a")))
		.moveToElement(driver.findElement(By.id("column-b")))
		.release()
		.build()
		.perform();
		driver.quit();

	}

}
