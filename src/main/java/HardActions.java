import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HardActions {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Марк\\IdeaProjects\\selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");

        driver.manage().window().maximize();
        WebElement link =driver.findElement(By.xpath("//li/a[text() ='Электроника']"));
        WebElement element  =driver.findElement(By.xpath("//li/a[text() ='Электроника']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(link).build().perform();

        actions.dragAndDrop(element,link).build().perform();
        actions.doubleClick(element);
        actions.contextClick(element);
        actions.clickAndHold(element).moveToElement(link).release().build().perform();

        Action action = actions.clickAndHold(element).moveToElement(link).release().build();
        action.perform();



    }
}
