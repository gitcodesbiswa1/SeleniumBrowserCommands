package com.navcom;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBack {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriverJars\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.navigate().to("https://www.google.co.in");
		dr.manage().window().maximize();
		String url= dr.getCurrentUrl();
		System.out.println(url);
		dr.navigate().to("https://login.yahoo.com/");
		url=dr.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);
		dr.navigate().back();
		url=dr.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(10000);
		dr.quit();
	}

}
