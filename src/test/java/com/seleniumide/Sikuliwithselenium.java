package com.seleniumide;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Sikuliwithselenium
{
	@Test
	public void demo() throws FindFailed, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/");	
		Screen s = new Screen();
		ImagePath.add("C:\\Users\\javed\\Desktop\\SeleniumIDEAutomationTest.sikuli");
		Thread.sleep(5000);
		//s.click("login.png");
		driver.findElement(By.xpath("//div//a[text()='Login']")).click();
		Thread.sleep(5000);
		s.type("email.png","voicera@gmail.com");
		Thread.sleep(5000);
		s.type("password.png","T@5t@123");
		Thread.sleep(5000);
		s.click("success.png");
	}
}
