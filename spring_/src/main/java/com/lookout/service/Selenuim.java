package com.lookout.service;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
 
public class Selenium{ 
	public static void main(String[] args) { 
		// Setting up the web driver 
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); 
		WebDriver driver = new ChromeDriver(); 
 
		// Navigating to the website 
		driver.get("https://www.cpp.edu/police/daily-crime-and-fire-log.shtml"); 
 
		// Scraping the title of the website 
		String title = driver.getTitle(); 
		System.out.println("Website title: " + title); 
 
		// Closing the web driver 
		driver.close(); 
	} 
}
