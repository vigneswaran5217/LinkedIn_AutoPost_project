package com.mini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoFileUpload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login");
		driver.findElement(By.id("username")).sendKeys("vigneswaran5217@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("session_password")).sendKeys("Vig@1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Sign in']")).click();

	}

}
