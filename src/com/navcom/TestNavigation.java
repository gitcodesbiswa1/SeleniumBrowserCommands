package com.navcom;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriverJars\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.navigate().to("https://www.google.co.in");
		dr.manage().window().maximize();
		dr.quit();
	}

}
