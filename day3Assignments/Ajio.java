package week3.day3Assignments;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.silentOutput","true");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(3000);
		String itemsFound = driver.findElement(By.className("length")).getText();
		String[] split = itemsFound.split(" ");
		System.out.println("The Total number of items found is "+split[0]);
		Set<WebElement> Brands = new LinkedHashSet<WebElement>( driver.findElements(By.className("brand")));
		System.out.println("Brands size is "+Brands.size());
		System.out.println("The Brands available are:");
		for (WebElement webElement : Brands) {
			String text= webElement.getText();
			System.out.println(text);
		}
		/*for (int i = 0; i < Brands.size(); i++) {
			System.out.println(Brands.get(i).getText());
			
		}
		*/
		List<WebElement> BagNames = driver.findElements(By.className("nameCls"));
		System.out.println("Bag names size is "+BagNames.size());
		System.out.println("The name of bags are:");
		for (int i = 0; i < Brands.size(); i++) {
			System.out.println(BagNames.get(i).getText());
			
		}
		driver.close();

	}

}
