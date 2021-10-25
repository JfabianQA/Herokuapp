package com.jfabian.loginpage; 


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/login");
	}
	
	@Test
	public void testHerokappPage() throws InterruptedException {
		WebElement UserName = driver.findElement(By.id("username"));
		WebElement PassWord = driver.findElement(By.id("password"));
		WebElement Login = driver.findElement(By.className("fa-sign-in"));
		UserName.click();
		Thread.sleep(2000);
		UserName.sendKeys("tomsmith");
		Thread.sleep(2000);
		PassWord.clear();
		PassWord.click();
		PassWord.sendKeys("SuperSecretPassword!!!");
		Thread.sleep(2000);
		Login.click();
		Thread.sleep(3000);
		driver.quit();
		
	}
	@After
	public void tearDown() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/login");
		
		WebElement UserName = driver.findElement(By.id("username"));
		WebElement PassWord = driver.findElement(By.id("password"));
		WebElement Login = driver.findElement(By.className("fa-sign-in"));
		UserName.click();
		Thread.sleep(2000);
		UserName.sendKeys("tomsmithyi");
		Thread.sleep(2000);
		PassWord.clear();
		PassWord.click();
		PassWord.sendKeys("SuperSecretPassword!");
		Thread.sleep(2000);
		Login.click();
		Thread.sleep(3000);
		driver.quit();
	}

}
