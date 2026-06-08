package Com.SeleniumBrowser.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxBrowserTesting {

	@Test(priority = 0)
	public void FirefoxBrowserTest1() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);
	}

	@Test(priority = 1)
	public void FirefoxBrowserTest2() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.bing.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);
	}

	@Test(priority = 2)
	public void FirefoxBrowserTest3() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.freecrm.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);
	}

	@Test(priority = 3)
	public void FirefoxBrowserTest4() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.chase.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);
	}

	@Test(priority = 4)
	public void FirefoxBrowserTest5() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://altoro.testfire.net/");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);
	}

	@Test(priority = 5)
	public void FirefoxBrowserTest6() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);
	}

	@Test(priority = 6)
	public void FirefoxBrowserTest7() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);
	}

	@Test(priority = 7)
	public void FirefoxBrowserTest8() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoblaze.com/index.html");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);
	}

	@Test(priority = 8)
	public void FirefoxBrowserTest9() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);
	}
}