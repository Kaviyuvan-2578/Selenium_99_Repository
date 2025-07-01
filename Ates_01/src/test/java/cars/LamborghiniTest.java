package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LamborghiniTest {

	@Test
	public void lamborghinilaunch() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lamborghini.com/en-en#val-ht");
		Reporter.log("Lamborghini Launched",true);
}
}
