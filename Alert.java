package week3.day4;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sss {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	     ChromeDriver driver=new ChromeDriver();
	     driver.get("http://www.leafground.com/pages/Alert.html");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     
	   driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
	   Alert alert=driver.switchTo().alert();
	   alert.accept();
	   
	    driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	    Alert confirm=driver.switchTo().alert();
	    confirm.accept();
	   
	   driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	   Alert prompt=driver.switchTo().alert();
	   prompt.sendKeys("sowmiya");
	   prompt.accept();
	   
	   
	  driver.findElement(By.xpath("//button[text()='Line Breaks?']"));
	  Alert line=driver.switchTo().alert();
	  String text=line.getText();
	 System.out.println(text);
	 line.accept();

	    driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
	    driver.findElement(By.xpath("//button[text()='OK']")).click();
	   
	    //Alert sweet=driver.switchTo().alert();
	    //sweet.accept();
	 
	 
	 
	 
	 
	}

}
