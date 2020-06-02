package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) {
	System. setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
	// Initialize browser.
	WebDriver driver=new ChromeDriver();
	driver.get("https://javabykiran.com/");
	
}
}
