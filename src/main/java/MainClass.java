import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Марк\\IdeaProjects\\selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(900,900));
        driver.get("https://en.wikipedia.org/wiki/Wiki");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement link =driver.findElement(By.linkText("Log in"));
        WebElement link2 =driver.findElement(By.partialLinkText("Donate"));
        WebElement searchField =driver.findElement(By.name("search"));
        WebElement searchButton = driver.findElement(By.className("searchButton"));
        WebElement id = driver.findElement(By.id("ca-viewsource"));
        WebElement input =driver.findElement(By.tagName("input"));
        WebElement cssLocator = driver.findElement(By.cssSelector("div#simpleSearch input#searchInput"));
        WebElement xPath =driver.findElement(By.xpath("//div[@id ='mw-panel']/div[@id='p-logo']/a"));
        link2.click();
        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
//        driver.quit();
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        System.out.println(driver.findElement(By.xpath("//li/a[@title =\"Guides to browsing Wikipedia\"]")).getText());
        driver.findElement(By.xpath("//div/input[@name =\"search\"]")).sendKeys("Selenium");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        WebElement searchClick =driver.findElement(By.xpath("//div/input[@name=\"go\"]"));

        searchClick.click();

    }
}
