package com.navcom;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateForward {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriverJars\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.get("https://www.google.co.in");
		dr.manage().window().maximize();
		String url= dr.getCurrentUrl();
		System.out.println(url);
		
		Thread.sleep(5000);
		dr.navigate().to("https://login.yahoo.com/");
		url=dr.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);
		dr.navigate().back();
		url=dr.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);
		
		dr.navigate().forward();
		url= dr.getCurrentUrl();
		System.out.println(url);
		
		Thread.sleep(5000);
		
		dr.navigate().refresh();
	
		dr.quit();
	}

}
