package com.selenium.maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenSample {


	public static void main(String[] args) throws InterruptedException 
	
	
	
	
	{
		
		 WebDriver driver=new ChromeDriver();
	

		 
		 driver.get("http://connect.maveric-systems.com/index.php/site/login");
		WebElement username = driver.findElement(By.xpath("//input[@id='LoginForm_username']"));
		username.sendKeys("salmasultanam");

Thread.sleep(2000);
		
	WebElement password = driver.findElement(By.xpath("//input[@id='LoginForm_password']"));
password.sendKeys("aaaaa");



Thread.sleep(2000);

Thread.sleep(2000);


		
		
	
	}

}
