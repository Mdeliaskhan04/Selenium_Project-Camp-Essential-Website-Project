package campEssentials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CampingLantern {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://camp-essential.netlify.app/products");
        Thread.sleep(2500);
        WebElement campingLantern=driver.findElement(By.xpath("(//button[contains(@class, 'bg-blue-500') and text()='See Details'])[1]"));
        campingLantern.click();
        Thread.sleep(2000);
        WebElement addToCart=driver.findElement(By.xpath("//button[text()='Add to Cart']"));
        addToCart.click();
    }
}
