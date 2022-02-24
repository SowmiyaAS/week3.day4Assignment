package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//pop up remove
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable_notification");
	     ChromeDriver driver=new ChromeDriver(option);
	     driver.get("https://www.nykaa.com/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     
	     Actions builder=new Actions(driver);
	      
	     WebElement first=driver.findElement(By.xpath("//a[text()='brands']"));
	     builder.moveToElement(first).perform();
	     //click L'Oreal paris
	     driver.findElement(By.xpath("(//div[@class='css-ov2o3v'])[6]/a")).click();
	     String text=" L'Oreal Paris  ";
	     String text1=driver.getTitle();
	     if(text1.contains(text))
	     {
	    		 System.out.println("correct");
	     
	}
	     else
	     {
	    	 System.out.println("wrong");
	     }

}
}
