package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcFrames {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Alerts and Frames\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://netbanking.hdfcbank.com/netbanking/");
	
    WebElement UserId = d.findElement(By.xpath("//input[@name='fldLoginUserId']"));
    
    JavascriptExecutor js=(JavascriptExecutor)d;
    js.executeScript("arguments[0].setAttribute('value','Siva0809');",UserId);

    WebElement UserBtn = d.findElement(By.xpath("(//img[@alt='continue'])[1]"));
    UserBtn.click();
    Thread.sleep(3000);
    WebElement Pass = d.findElement(By.xpath("(//input[@class='input_password'])[2]"));
    Pass.sendKeys("08091990");
    
    WebElement LoginBtn = d.findElement(By.xpath("//img[@alt='Login']"));
    LoginBtn.click();
}
}
