import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavaScript {
public static void main(String []args){
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Марк\\IdeaProjects\\selenium\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://en.wikipedia.org/wiki/Main_Page");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    JavascriptExecutor jse =(JavascriptExecutor) driver;
   // jse.executeScript(" alert('HELLO WORLD!');");
    jse.executeScript("window.scrollBy(0,2000)","");
    jse.executeScript("window.scrollBy(0,-1000)","");




}


}
