package day1;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multisselect {

	public static void main(String[] args) {
		  
	      WebDriver driver = new ChromeDriver();
          driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
WebElement dropdown = driver.findElement(By.xpath("//*[@id='demo-multiple-select-input']"));

	      
	      Select select = new Select(dropdown);

	      // gets options of dropdown in list
	      List<WebElement> options = select.getOptions();
	      for (WebElement opt : options){
	         System.out.println("Options are: " + opt.getText());
	      }

	      // return true if multi-select dropdown
	      Boolean b = select.isMultiple();
	      System.out.println("Boolean value for multiple dropdown: "+ b);

	      // select item by visible text
	      select.selectByVisibleText("Books");

	      // select item by value
	      select.selectByValue("2");

	      // select item by index
	      select.selectByIndex(2);

	      // get all selected options of dropdown in list
	      List<WebElement> selectedOptions = select.getAllSelectedOptions();
	      for (WebElement opt : selectedOptions){
	         System.out.println("Selected Options are: " + opt.getText());
	      }

	      // get first selected option in dropdown
	      WebElement f = select.getFirstSelectedOption();
	      System.out.println("First selected option is: "+ f.getText());

	      // deselect option by index
	      select.deselectByIndex(2);

	      // get all selected options of dropdown after deselecting 1
	      List<WebElement> deletedOptions = select.getAllSelectedOptions();
	      System.out.println("No. options selected after deselecting one option: " + deletedOptions.size());

	      // deselect all selected items
	      select.deselectAll();

	      // get all selected options of dropdown after deselected
	      List<WebElement> deletedAllOptions = select.getAllSelectedOptions();
	      System.out.println("No. options selected after deselecting all: " + deletedAllOptions.size());

	     
	}

}
