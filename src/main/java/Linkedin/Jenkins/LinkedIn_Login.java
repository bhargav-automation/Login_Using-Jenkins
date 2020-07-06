package Linkedin.Jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkedIn_Login {
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		WebElement signin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav//a[contains(.,'Sign in')]")));
		signin.click();
		Thread.sleep(3000);
		WebElement usernamebtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'username')]")));
		usernamebtn.sendKeys("jyothsna.cool14@gmail.com");
		Thread.sleep(1000);

		WebElement passwordbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'password')]")));
		passwordbtn.sendKeys("143J1A0514");
		Thread.sleep(1000);

		WebElement signinbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,'Sign in')]")));
		signinbtn.click();
		Thread.sleep(3000);
		
		
	}

}
