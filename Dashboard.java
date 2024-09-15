package campEssentials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dashboard {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://camp-essential.netlify.app/");
        WebElement dashboard=driver.findElement(By.linkText("Dashboard"));
        dashboard.click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        String actualPage=driver.getTitle();
        System.out.println(actualPage);
        String expectedPage="Camp Essential";
        if(actualPage.contentEquals(expectedPage))
        {
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }
    }
}
