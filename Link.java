package campEssentials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Link {
    public static <List> void main(String[] args) {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://camp-essential.netlify.app/");
       java.util.List<WebElement> elements= driver.findElements(By.tagName("a"));
        for(WebElement element:elements)
        {
            System.out.println("Elements is:"+element.getText());
            System.out.println("Element is:"+element.getSize());
        }
    }
}
