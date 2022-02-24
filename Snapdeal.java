package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		//pop up remove
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable_notification");
	     ChromeDriver driver=new ChromeDriver(option);
	     driver.get("https://www.snapdeal.com/");
	     driver.manage().window().maximize();
	     
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    Actions builder=new Actions(driver); 
	    
	     WebElement snap=driver.findElement(By.xpath("//span[@class='catText']"));
	     builder.moveToElement(snap).perform();
	     driver.findElement(By.linkText("Sports Shoes")).click();
	     
	     
	     WebElement sportsshoecount = driver.findElement(By.xpath("//div[@class='child-cat-name selected']/following-sibling::div"));
	     String count =sportsshoecount.getText();
	     System.out.println("sports shoes count is"+ count);
	
	//get title
	String text1=driver.getTitle();
	System.out.println(text1);
	
	}

}








