package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Alerts and Frames\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get(" https://retail.onlinesbi.com/retail/login.htm");
	
	WebElement ContBtn = d.findElement(By.xpath("(//a[@class='login_button'])[1]"));
    ContBtn.click();
    
    WebElement LoginBtn = d.findElement(By.id("Button2"));
    LoginBtn.click();
    Thread.sleep(3000);
    
    Alert al = d.switchTo().alert();
    al.accept();
}
}
