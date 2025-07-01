package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BMWTest {

	@Test
	public void BMWlaunch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bmw-kunexclusive-bengaluru.in/");
		Reporter.log("BMW Launched",true);
}
}
