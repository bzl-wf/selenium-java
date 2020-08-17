package org.seleniumhq.selenium.selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class LoginAuth {
	/**
	 * 登陆
	 * @throws InterruptedException 
	 */
	public void loginAuth() throws InterruptedException {
		// TODO Auto-generated method stub
		

		// 指定浏览器驱动路径
		
		String chromePath = "D://Tool//eclipse//chromedriver_win32//chromedriver.exe";

		// 设置指定键对值的系统属性
		System.setProperty("webdriver.chrome.driver", chromePath);

		// 创建驱动对象

		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		StructureTest structureTest = new StructureTest();
		// 获取网址

		driver.get("https://gitee.com/");
		// 界面最大化
		driver.manage().window().maximize();
//		driver.manage().window().setSize(new org.openqa.selenium.Dimension(100, 200));
	
			Thread.sleep(1000);
	

		driver.findElement(By.cssSelector(".item.git-nav-user__login-item")).click();
		// 输入用户名
		driver.findElement(By.id("user_login")).sendKeys(structureTest.account);

		// 输入密码
		driver.findElement(By.id("user_password")).sendKeys(structureTest.password);
		

		driver.findElement(By.id("user_remember_me")).click();;
		
		
			Thread.sleep(1000);
	

		// 点击登录
		// driver.findElement(By.name("commit")).click();

		WebElement log = driver.findElement(By.name("commit"));
		log.submit();
		
		
		Thread.sleep(5000);
		driver.close();
		
	
			
	}

}
