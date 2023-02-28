package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class W2d2assignments {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get ("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("shalini.co");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("shalu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("ltd");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shalu@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("923456789");
		driver.findElement(By.name("submitButton")).click();
	

	}

}
