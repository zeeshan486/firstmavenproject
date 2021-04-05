package com.first.maven.firstmavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import webhandling.Browserfactory;

public class AppTest 
{
    @Test
    public void method1() throws Exception
    {
       System.out.println("you are success");
       System.out.println("now it is ok");
       System.out.println("modified after pushing to github");
      WebDriverManager.firefoxdriver().setup();
     // FirefoxOptions option = new FirefoxOptions();
      	FirefoxDriver driver = new FirefoxDriver();  
       driver.get("https://www.google.com/?gws_rd=ssl");
       Thread.sleep(3000);
       driver.close();
       
       
       
       
       
    }
    
}
