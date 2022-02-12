package week3.day2.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.Context.Key;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
//	1. Launch the URL https://www.ajio.com/
//		2. In the search box, type as "bags" and press enter
//		3. To the left  of the screen under " Gender" click the "Men"
//		4. Under "Category" click "Fashion Bags"
//		5. Print the count of the items Found. 
//		6. Get the list of brand of the products displayed in the page and print the list.
//		7. Get the list of names of the bags and print it

	public static void main(String[] args) throws InterruptedException {
int count=0;
int count1=0;
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		System.out.println("Total number of items found : "+ driver.findElement(By.className("length")).getText());
		Thread.sleep(2000);
List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"brand\"]"));
System.out.println("number of product in the page is "+list.size());
System.out.println("**********Brand of the Products**********");
for (WebElement webElement : list) {
	count1=count1+1;
	System.out.println(count1+") "+webElement.getText());
	}
Thread.sleep(2000);
List<WebElement> bagNameList = driver.findElements(By.className("nameCls"));
System.out.println("number of bags in the page is :" + bagNameList.size());
System.out.println("**********Names of the Bags**********");
for (WebElement webElement : bagNameList) {
	String text = webElement.getText();
	count=count+1;
	System.out.println(count+") "+text);
}
Thread.sleep(1000);
driver.close();

	
	}

}
