package campEssentials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class priceLowToHigh {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://camp-essential.netlify.app/products");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement PriceLowtoHigh = driver.findElement(By.xpath("(//select[contains(@class, 'border border-gray-300 px-2 py-1 rounded-md w-full sm:w-auto')])[3]"));
        Select select=new Select(PriceLowtoHigh);
        select.selectByIndex(1);
        WebElement button = driver.findElement(By.xpath("//button[text()='Clear Filters']"));
        button.click();

    }
}
