import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WorkWithWindows {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Марк\\IdeaProjects\\selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html");
        String mainWindow =driver.getWindowHandle();
       WebElement link= driver.findElement(By.xpath("//table[@summary='Java SE Development Kit 8u211 Downloads']//a[text()='Oracle Technology Network License Agreement for Oracle Java SE']"));
        link.click();

        for(String windowHandle:driver.getWindowHandles()){
            driver.switchTo().window(windowHandle);

        }
        driver.manage().window().maximize();
        WebElement link2 =driver.findElement(By.xpath("//div[text()='Menu']"));
/*        Actions actions = new Actions(driver);
        actions.moveToElement(link2).build().perform();*/
link2.click();
        driver.switchTo().window(mainWindow);
        driver.findElement(By.xpath("//span[text()='Overview']")).click();







    }
}
