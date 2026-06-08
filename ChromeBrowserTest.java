package Com.SeleniumChrome.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		String Pagesource=driver.getPageSource();
		System.out.println(Pagesource);
	}

}
