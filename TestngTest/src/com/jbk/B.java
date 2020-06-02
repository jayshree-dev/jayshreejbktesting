package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class B {
	
	public WebDriver wd;
	test1

  @Test(priority=1)
  public void testHeading() {
	  wd=new ChromeDriver();
	  wd.get("file:///Users/jayshreedigrase/Desktop/Offline%20Website/index.html");
	  WebElement heading=wd.findElement(By.xpath("/html/body/div/div[2]/p"));
	  String Expectedheading=heading.getText();
	  Assert.assertEquals("Sign in to start your session", Expectedheading);
	  wd.close();
	  wd.quit();
  }
  
  @Test(priority=2)
  public void BlankmsgEmailTest() {
	  wd=new ChromeDriver();
	  wd.get("file:///Users/jayshreedigrase/Desktop/Offline%20Website/index.html");
      WebElement uname=wd.findElement(By.id("email"));
      uname.sendKeys("");
      wd.findElement(By.id("password")).sendKeys("");
      wd.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
      WebElement Blankemail=wd.findElement(By.xpath("//*[@id=\"email_error\"]"));
      String Expectedmsg=Blankemail.getText();
      System.out.println(Expectedmsg);
      Assert.assertEquals("Please enter email.", Expectedmsg);
      
      wd.quit();
  }
  
  @Test(priority=3)
  public void BlankmsgPwdTest() {
	  wd=new ChromeDriver();
	  wd.get("file:///Users/jayshreedigrase/Desktop/Offline%20Website/index.html");
      wd.findElement(By.id("email")).sendKeys("");
      wd.findElement(By.id("password")).sendKeys("");
      wd.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
      WebElement Blankpwd=wd.findElement(By.xpath("//*[@id=\"password_error\"]"));
      String Expectedmsg=Blankpwd.getText();
      System.out.println(Expectedmsg);
      Assert.assertEquals("Please enter password.", Expectedmsg);
      wd.quit();
  }
  
	  @Test(priority=4)
	  public void ErrormsgEmailTest() {
		  wd=new ChromeDriver();
		  wd.get("file:///Users/jayshreedigrase/Desktop/Offline%20Website/index.html");
	      WebElement uname1=wd.findElement(By.id("email"));
	      uname1.sendKeys("aaa");
	      WebElement pwd1=wd.findElement(By.id("password"));
	      pwd1.sendKeys("bbb");
	      wd.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	      WebElement Erroremail=wd.findElement(By.xpath("//*[@id=\"email_error\"]"));
	      String Expectedmsg=Erroremail.getText();
	      System.out.println(Expectedmsg);
	      Assert.assertEquals("Please enter email as kiran@gmail.com", Expectedmsg);
	      uname1.clear();
	      pwd1.clear();
	      wd.quit();
	  }
	  
	  @Test(priority=5)
	  public void ErrorPwdMsgTest() {
		  wd=new ChromeDriver();
		  wd.get("file:///Users/jayshreedigrase/Desktop/Offline%20Website/index.html");
	      WebElement uname2=wd.findElement(By.id("email"));
	      uname2.sendKeys("aaa");
	      WebElement pwd2=wd.findElement(By.id("password"));
	      pwd2.sendKeys("bbb");
	      wd.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	      WebElement Errorpwd=wd.findElement(By.xpath("//*[@id=\"password_error\"]"));
	      String Expectedmsg=Errorpwd.getText();
	      System.out.println(Expectedmsg);
	      Assert.assertEquals("Please enter password 123456", Expectedmsg);
	      uname2.clear();
	      pwd2.clear();
	      wd.quit();
	  }
	  
	  @Test(priority=6)
	  public void InvalidEmailBlankPwdErrormsgTest() {
		  wd=new ChromeDriver();
		  wd.get("file:///Users/jayshreedigrase/Desktop/Offline%20Website/index.html");
	      WebElement uname3=wd.findElement(By.id("email"));
	      uname3.sendKeys("aaa");
	      WebElement pwd3=wd.findElement(By.id("password"));
	      pwd3.sendKeys("");
	      wd.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	      WebElement ErrorEmail=wd.findElement(By.xpath("//*[@id=\"email_error\"]"));
	      String Expectedmsg=ErrorEmail.getText();
	      WebElement ErrorPwd=wd.findElement(By.xpath("//*[@id=\"password_error\"]"));
	      String ExpectedPwdMsg=ErrorPwd.getText();
	      System.out.println(ExpectedPwdMsg);
	      System.out.println(Expectedmsg+ExpectedPwdMsg);
	      Assert.assertEquals("Please enter valid email."+"Please enter password.", Expectedmsg+ExpectedPwdMsg);
	      uname3.clear();
	      pwd3.clear();
	      wd.quit();
	      
	  }
	  
	  @Test(priority=7)
	  public void InvalidPwdBlankEmailErrormsgTest() {
		  wd=new ChromeDriver();
		  wd.get("file:///Users/jayshreedigrase/Desktop/Offline%20Website/index.html");
	      WebElement uname3=wd.findElement(By.id("email"));
	      uname3.sendKeys("");
	      WebElement pwd3=wd.findElement(By.id("password"));
	      pwd3.sendKeys("sss");
	      wd.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	      WebElement BlanckEmail=wd.findElement(By.xpath("//*[@id=\"email_error\"]"));
	      String Expectedmsg=BlanckEmail.getText();
	      WebElement ErrorPwd=wd.findElement(By.xpath("//*[@id=\"password_error\"]"));
	      String ExpectedPwdMsg=ErrorPwd.getText();
	      System.out.println(ExpectedPwdMsg);
	      System.out.println(Expectedmsg+ExpectedPwdMsg);
	      Assert.assertEquals("Please enter valid email."+"Please enter password.", Expectedmsg+ExpectedPwdMsg);
	      uname3.clear();
	      pwd3.clear();
	      wd.quit();
	      
	  }
	  
  }

