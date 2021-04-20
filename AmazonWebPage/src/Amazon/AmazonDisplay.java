package Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDisplay {
	
	public static void main(String[] args) {
		AmazonDisplay Method = new AmazonDisplay();
		Method.display();
	}

	public void display() {
		System.setProperty("webdriver.chrome.driver","F:\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		//Thread.sleep(2000);
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("nav-hamburger-menu")).click();
		
		driver.findElement(By.xpath("//a[@class='hmenu-item' and @data-menu-id='2']")).click();
			
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[3]/a")).click();
		
		System.out.println("Validation : Next generation smart speaker with improved bass and Alexa (Black)");
		boolean MainMenu = driver.findElement(By.xpath("//span[@id='productTitle']")).isDisplayed();
		System.out.println(MainMenu);
		
		System.out.println("Validation : MRP/PRICE");
		boolean MainPrice = driver.findElement(By.xpath("//*[@id='price']/table")).isDisplayed();
		System.out.println(MainPrice);
		
		
		System.out.println("Validation : Image of Next generation smart speaker with improved bass and Alexa (Black)");
		boolean MainImg = driver.findElement(By.xpath("//img[@id='landingImage']")).isDisplayed();
		System.out.println(MainImg);
		
		driver.quit();
	}
}
