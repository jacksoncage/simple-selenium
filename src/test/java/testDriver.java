import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * A simple junit test. Open and url with Firefox browser and get's site title.
 *
 * @author love.nyberg@lovemusic.se
 */
public class testDriver {

	@Test
	public void startSite() {
		String url = "https://lovemusic.se";
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		String title = driver.getTitle();
		System.out.println("The title of " + url + " is: " + title);
		driver.quit();
	}
}
