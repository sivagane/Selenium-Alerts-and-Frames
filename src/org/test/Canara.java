package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Canara {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Alerts and Frames\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
	
	WebElement SignBtn = d.findElement(By.xpath("//input[@class='btn btn-default']"));
    SignBtn.click();
    Thread.sleep(3000);
    Alert al = d.switchTo().alert();
    al.accept();
}
}
