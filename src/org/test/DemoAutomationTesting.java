package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomationTesting {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Alerts and Frames\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://demo.automationtesting.in/Alerts.html");
	
	WebElement AlBtn = d.findElement(By.xpath("//button[@class='btn btn-danger']"));
    AlBtn.click();
    Thread.sleep(3000);
    Alert al = d.switchTo().alert();
    al.accept();
    Thread.sleep(3000);
    
    WebElement AlwOk = d.findElement(By.xpath("//a[@href='#CancelTab']"));
    AlwOk.click();
     
   WebElement AlBtnP = d.findElement(By.xpath("//button[@class='btn btn-primary']"));
   AlBtnP.click(); 
   Thread.sleep(3000);
    Alert AlOk = d.switchTo().alert();
    AlOk.dismiss();
    
    WebElement AlwTextBox = d.findElement(By.xpath("//a[@href='#Textbox']"));
    AlwTextBox.click();
    Thread.sleep(3000);
    WebElement AlBtnPb = d.findElement(By.xpath("//button[@class='btn btn-info']"));
    AlBtnPb.click();
    Thread.sleep(3000);
    Alert AlT = d.switchTo().alert();
    AlT.sendKeys("Accept Alert");
    AlT.accept();
}
}
