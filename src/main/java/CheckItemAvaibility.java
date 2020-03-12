import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckItemAvaibility {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Марк\\IdeaProjects\\selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/");
        List <WebElement> elem= driver.findElements(By.xpath("//a[@class=\"HeaderMenu-link no-underline mr-3\"]"));
        System.out.println(elem.size());
        List <WebElement> elem1= driver.findElements(By.xpath("//a"));
        System.out.println(elem1.size());



    }
}
