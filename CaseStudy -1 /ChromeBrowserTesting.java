package Com.SeleniumBrowser.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeBrowserTesting {
	@Test(priority = 0)
	public void ChromeBrowserTest1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);

	}

	@Test(priority = 1)
	public void ChromeBrowserTest2() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);

	}

	@Test(priority = 2)
	public void ChromeBrowserTest3() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);

	}

	@Test(priority = 3)
	public void ChromeBrowserTest4() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.chase.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);
	}

	@Test(priority = 4)
	public void ChromeBrowserTest5() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://altoro.testfire.net/");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);

	}

	@Test(priority = 5)
	public void ChromeBrowserTest6() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);

	}

	@Test(priority = 6)
	public void ChromeBrowserTest7() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);

	}

	@Test(priority = 7)
	public void ChromeBrowserTest8() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/index.html");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);

	}

	@Test(priority = 8)
	public void ChromeBrowserTest9() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);

	}

}
