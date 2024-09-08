package campEssentials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Products {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://camp-essential.netlify.app/");
        Thread.sleep(2000);
        WebElement products=driver.findElement(By.linkText("Products"));
        products.click();
        Thread.sleep(2000);
        WebElement categories=driver.findElement(By.linkText("Category"));
        categories.click();
        Thread.sleep(2000);
        WebElement Aboutus=driver.findElement(By.linkText("About Us"));
        Aboutus.click();
        Thread.sleep(2000);
        WebElement bin=driver.findElement(By.linkText("0"));
        bin.click();
    }
}
