package org.seleniumhq.selenium.selenium_java;

import java.awt.TexturePaint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginAuthTest {

	private WebDriver driver;

	@BeforeTest
	public void beforEach() {

		// 指定浏览器驱动路径

		String chromePath = "D://Tool//IDEA//chromedriver.exe";

		// 设置指定键对值的系统属性
		System.setProperty("webdriver.chrome.driver", chromePath);

		driver = new ChromeDriver();

	}

	@AfterTest
	public void afterEach() {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {

		driver.get("https://gitee.com/");

		driver.manage().window().maximize();

		Thread.sleep(1000);

		StructureTest structureTest = new StructureTest();

		driver.findElement(By.cssSelector(".item.git-nav-user__login-item")).click();
		// 输入用户名
		driver.findElement(By.id("user_login")).sendKeys(structureTest.account);

		// 输入密码
		driver.findElement(By.id("user_password")).sendKeys(structureTest.password);

		// 点击登录
		// driver.findElement(By.name("commit")).click();

		WebElement log = driver.findElement(By.name("commit"));
		log.submit();
		Thread.sleep(5000);

	}

	@Test(enabled = false)
	public void test01() {
		System.out.println("忽略测试");
	}

	@Test(dependsOnMethods = { "test" })
	public void test02() {
		System.out.println("依赖测试");
	}


}
