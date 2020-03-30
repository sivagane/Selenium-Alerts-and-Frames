package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICICI {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Alerts and Frames\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
	d.switchTo().frame("Revamp_Banner_ID");
	WebElement UserId = d.findElement(By.xpath("//input[@class='login-input mode-select-userid']"));
    UserId.sendKeys("0809siva");
    WebElement Pass = d.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
    Pass.sendKeys("sivaganesh");
}
}
