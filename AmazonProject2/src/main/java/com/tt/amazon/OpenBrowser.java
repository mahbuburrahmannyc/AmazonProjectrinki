package com.tt.amazon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenBrowser {
	public static void main(String[]args) throws Throwable  {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\glori\\Downloads\\Chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.Amazon.com/");
		driver.manage().window().maximize();
		driver.getTitle();
		driver.navigate();// for backward, forward and refresh
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@class='nav-a nav-a-2']")).click();
		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("mmrsd2k@gmail.com");//WebElement(object)
		driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("test1234");
		driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//webdriver wait
		Thread.sleep(5000);
		
	

	
		
		//driver.close();
		//driver.quit();
		//if(driver.getTitle().equals("Amazon.com:Online Shopping for  cloths, books, DVDs and more")) {
			//System.out.println("Test Pass");
			
	//	}
		//else 
		//	System.out.println("Test fail"

	Select dropDown=new Select(driver.findElement(By.xpath("//*[@class='nav-search-dropdown searchSelect']")));
	dropDown.selectByVisibleText("Books");
	List<WebElement> drop=dropDown.getOptions();
	System.out.println(drop.size());
	for(int i=0; i<drop.size();i++) {
		System.out.println(drop.get(i).getText());
	}
	
}
}

	

		
		
	


