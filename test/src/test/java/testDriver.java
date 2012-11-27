import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by IntelliJ IDEA.
 * User: lovenybe
 * Date: 2012-11-27
 * Time: 10:40
 */
public class testDriver {

	@Test
	public void startSite() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://viaplay.se");
		String title = driver.getTitle();
		System.out.print(title);
		driver.quit();
	}
}
