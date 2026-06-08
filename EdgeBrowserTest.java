package Com.Selenium.EdgeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class EdgeBrowserTest {
  public static void main(String[]args) {
	  WebDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
  }
}
