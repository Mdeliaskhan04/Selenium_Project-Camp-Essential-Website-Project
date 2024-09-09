package campEssentials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CampingHatchingOne {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://camp-essential.netlify.app/products/66925ae1e5f2ad09a0df6158");
        Thread.sleep(2000);
        WebElement click=driver.findElement(By.xpath("//button[contains(@class, 'bg-[#22A1F0]') and text()='Add to Cart']"));
        click.click();
    }
}
