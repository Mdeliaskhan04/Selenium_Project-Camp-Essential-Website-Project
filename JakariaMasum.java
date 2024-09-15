package campEssentials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class JakariaMasum {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://camp-essential.netlify.app/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3500)","");
        driver.navigate().refresh();

        String actualPageTitle= driver.getTitle();
        System.out.println(actualPageTitle);
        String expectedPageTitle="Camp Essential";
        System.out.println(expectedPageTitle);

        if(actualPageTitle.contentEquals(expectedPageTitle))
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }

    }
}
