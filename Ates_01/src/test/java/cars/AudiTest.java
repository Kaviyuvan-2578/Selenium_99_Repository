package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AudiTest {

	@Test
	public void audilaunch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://auditestdrive.in/");
		Reporter.log("Audi Launched",true);
	}
	
}
