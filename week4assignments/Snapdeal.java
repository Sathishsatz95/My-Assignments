package week4assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//Launch (https://www.snapdeal.com/)
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Go to "Men's Fashion".
		WebElement Fashion = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		Actions Men = new Actions(driver);
		Men.moveToElement(Fashion).perform();
		
		//Go to "Sports Shoes".
		WebElement Shoes = driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]"));
		Shoes.click();
		
		//Get the count of sports shoes.
		WebElement Count = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[2]"));
		String Total = Count.getText();
		System.out.println("The Total Number of Sports Shoes:" + Total);
		
		//Click on "Training Shoes".
		WebElement TrainingShoes = driver.findElement(By.xpath("(//div[text()='Training Shoes'])[1]"));
		TrainingShoes.click();
		
		//Sort the products by "Low to High".
		WebElement Sort = driver.findElement(By.className("sort-label"));
		Sort.click();
		WebElement LowtoHigh = driver.findElement(By.xpath("//li[@data-sorttype='plth']"));
		LowtoHigh.click();
		
		//Check if the displayed items are sorted correctly.
		
		
		
		
		//Select any price range ex:(500-700).
		
		driver.findElement(By.xpath("(//a[@data-key='Price|Price'])[1]"));
		//driver.findElement(By.xpath("(//div[@class='clear'])[5]")).clear();
		//driver.findElement(By.xpath("(//span[@class='rsText'])[1]")).sendKeys("500");
		//driver.findElement(By.xpath("(//span[@class='rsText'])[2]")).sendKeys("700");
		//WebElement Go = driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']"));
		//Go.click();
		
	
		//Filter by any colour.
		WebElement Colour = driver.findElement(By.xpath("//label[@for='Color_s-Black']"));
		Colour.click();
		
		
		//Verify all the applied filters
		//Mouse hover on the first resulting "Training Shoes".
		//Click the "Quick View" button.
		//Print the cost and the discount percentage.
		//Take a snapshot of the shoes.
		//Close the current window.
		//Close the main window.
		
	}

}
