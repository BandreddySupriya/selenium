package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdropdowns {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//validation of txt messsage
		String expectedtxt="Dropdown Example";
		String actuvaltxt = driver.findElement(By.xpath("//*[text()='Dropdown Example']")).getText();
		System.out.println(actuvaltxt);
		if(actuvaltxt.equalsIgnoreCase(expectedtxt)) {
			
			System.out.println("valid both text");
		}
		else {
			System.out.println("Invalid both text");
			
			}
		Select sel=new Select(driver.findElement(By.id("dropdown-class-example")));
		//sel.selectByIndex(1);
		sel.selectByValue("option2");
		
		//sel.deselectByVisibleText("option2");
		
		System.out.println(sel.getFirstSelectedOption().getText());
		
	}

}
