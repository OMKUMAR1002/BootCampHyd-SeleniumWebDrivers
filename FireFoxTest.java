package Com.SeleniumFireFox.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FireFoxTest {
	public static void main(String[]args) {
		  WebDriver driver = new EdgeDriver();
			driver.get("https://www.selenium.dev/");
			driver.manage().window().maximize();
			String Title = driver.getTitle();
			System.out.println(Title);
	  }
}
