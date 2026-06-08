package Com.SeleniumBrowser.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgeBrowserTesting {

	@Test(priority = 0)
	public void EdgeBrowserTest1() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);

	}

	@Test(priority = 1)
	public void EdgeBrowserTest2() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.bing.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);

	}

	@Test(priority = 2)
	public void EdgeBrowserTest3() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.freecrm.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);
	}

	@Test(priority = 3)
	public void EdgeBrowserTest4() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.chase.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);
	}

	@Test(priority = 4)
	public void EdgeBrowserTest5() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://altoro.testfire.net/");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);

	}

	@Test(priority = 5)
	public void EdgeBrowserTest6() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);

	}

	@Test(priority = 6)
	public void EdgeBrowserTest7() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);

	}

	@Test(priority = 7)
	public void EdgeBrowserTest8() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoblaze.com/index.html");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);

	}

	@Test(priority = 8)
	public void EdgeBrowserTest9() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.opencart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource = driver.getPageSource();
		System.out.println(Pagesource);

	}
}