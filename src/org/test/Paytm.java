package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Alerts and Frames\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://paytm.com/");
	d.manage().window().maximize();
	WebElement LoginBtn = d.findElement(By.xpath("//div[@class='_3ac-']"));
    LoginBtn.click();
    Thread.sleep(3000);
    d.switchTo().frame(0);

    WebElement SigninBtn = d.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']"));
    SigninBtn.click();

    WebElement EmailId = d.findElement(By.name("username"));
    EmailId.sendKeys("sivag918@gmail.com");
    
    WebElement Pass = d.findElement(By.name("password"));
    Pass.sendKeys("08091990");
    
    WebElement LoginBtn1 = d.findElement(By.xpath("//button[@class='md-raised md-primary btn-new mt-20 login-btn md-button ng-scope md-default-theme']"));
    LoginBtn1.click();
}
}
