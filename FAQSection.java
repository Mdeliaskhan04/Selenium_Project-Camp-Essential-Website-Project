package campEssentials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FAQSection {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://camp-essential.netlify.app/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,4750)", "");

        WebElement header = driver.findElement(By.xpath("//h3[text()='What types of camping gear do you offer?']"));
        header.click();
        Thread.sleep(1500);
        header.click();
        Thread.sleep(1500);

        WebElement header2 = driver.findElement(By.xpath("//h3[text()='Do you provide product warranties?']"));
        header2.click();
        Thread.sleep(1500);

        WebElement header3=driver.findElement(By.xpath("//h3[text()='Can I return or exchange an item?']"));
        header3.click();

        WebElement header4=driver.findElement(By.xpath("//h3[text()='Do you offer discounts for bulk purchases?']"));
        header4.click();

        WebElement header5=driver.findElement(By.xpath("//h3[text()='How can I track my order?']"));
        header5.click();

    }
}
