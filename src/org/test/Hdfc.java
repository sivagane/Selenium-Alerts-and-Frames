package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Alerts and Frames\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
	JavascriptExecutor js=(JavascriptExecutor)d;
	WebElement ContBtn = d.findElement(By.xpath("//a[@href='javascript:void(0)']"));
	js.executeScript("arguments[0].click()", ContBtn);
	Thread.sleep(3000);
	
	Alert al = d.switchTo().alert();
    al.accept();
}
}
