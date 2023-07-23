package com.mini;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.RateLimiterBuilder;
import io.netty.handler.codec.AsciiHeadersEncoder.NewlineType;

public class LinkedIn {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login");
		driver.findElement(By.id("username")).sendKeys("vigneswaran5217@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("session_password")).sendKeys("Vig@1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		Thread.sleep(1000);
		WebElement photo=driver.findElement(By.xpath("//span[text()='Start a post']/parent::button"));
		Actions a= new Actions(driver);
		a.moveToElement(photo).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Start a post']/parent::button")).click();
		Thread.sleep(2000);
		WebElement img= driver.findElement(By.xpath("//button[contains(@class,'share-promoted-detour-button')]/child::span"));
		Actions im=new Actions(driver);
		im.moveToElement(img);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class,'share-promoted-detour-button')]/child::span")).click();
		Robot rd= new Robot();
		rd.delay(2000);
		StringSelection ss=new StringSelection("\"D:\\Pega CSSA.png\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rd.keyPress(KeyEvent.VK_CONTROL);
		rd.keyPress(KeyEvent.VK_V);
		rd.delay(1000);
		rd.keyRelease(KeyEvent.VK_CONTROL);
		rd.keyRelease(KeyEvent.VK_V);
		rd.delay(1000);
		rd.keyPress(KeyEvent.VK_ENTER);
		rd.keyRelease(KeyEvent.VK_ENTER);
		rd.delay(1000);
		WebElement pos= driver.findElement(By.xpath("//span[text()='Done']/parent::button"));
		Actions t=new Actions(driver);
		t.moveToElement(pos);
		driver.findElement(By.xpath("//span[text()='Done']/parent::button")).click();
		WebElement don= driver.findElement(By.xpath("//span[text()='Post']/parent::button"));
		Actions e=new Actions(driver);
		e.moveToElement(don);
		driver.findElement(By.xpath("//span[text()='Post']/parent::button")).click();
		Thread.sleep(10000);
		//WebDriverWait wait = new WebDriverWait(driver,30);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		Thread.sleep(2000);
		driver.quit();
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
