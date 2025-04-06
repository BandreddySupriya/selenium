package day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselection {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/select-menu");
        Select sel=new Select(driver.findElement(By.id("cars")));
        sel.selectByIndex(0);
        sel.selectByVisibleText("Saab");
        sel.selectByValue("opel");
        List<WebElement> options = sel.getOptions();
        for(WebElement option:options) {
        	System.out.println(option.getText());
        }
        sel.deselectAll();
		
		
	}

}
