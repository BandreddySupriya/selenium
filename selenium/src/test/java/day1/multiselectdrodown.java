package day1;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class multiselectdrodown {

	public static void main(String[] args) throws Exception {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         driver.get("https://demoqa.com/select-menu");
         //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
         //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=' css-yk16xz-control'])[3]")));
        
         //Select sel=new Select(driver.findElement(By.xpath("(//div[@class=' css-yk16xz-control'])[3]")));
//         //see all options
//         List<WebElement> options = sel.getOptions();
//         System.out.println(options.size());
//         for(WebElement option:options) {
//        	 
//        	String text=option.getText();
//        	System.out.println(text);
//        	 
//         }
         //sel.selectByIndex(0);
         //sel.selectByVisibleText("Saab");
         
         //click on multiselectdropdownlist when select tag not there on webpage
         WebElement dropdowninput = driver.findElement(By.xpath("(//div[@id='selectMenuContainer']//div[contains(@class,'css-1hwfws3')])[3]"));
         Thread.sleep(3000);
         dropdowninput.click();
         //select multiple options
        String[] valuetoselect ={"Green","Blue","Black"};
        for(String value:valuetoselect) {
        	WebElement input=driver.findElement(By.xpath("//div[@id='selectMenuContainer']//input"));
        	input.sendKeys(value);
        	Thread.sleep(500);
        	//wait for suggestion
        	input.sendKeys(org.openqa.selenium.Keys.ENTER);
        	
        }
        		 
        Thread.sleep(2000);
	}

}
