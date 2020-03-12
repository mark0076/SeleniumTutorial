import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Keys1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Марк\\IdeaProjects\\selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        WebElement textField =driver.findElement(By.xpath("//input[@id=\"searchInput\"]"));
        String select =Keys.chord(Keys.CONTROL,"a");
        String cut = Keys.chord(Keys.CONTROL,"x");
        String paste = Keys.chord(Keys.CONTROL,"v");


        textField.sendKeys(Keys.chord(Keys.SHIFT,"test"));
        textField.sendKeys(select);
        textField.sendKeys(cut);
        textField.sendKeys(paste);
        textField.sendKeys(Keys.ENTER);
        Date dateNow = new Date();
        SimpleDateFormat format = new SimpleDateFormat("hh_mm_ss");
        String fileName=format.format(dateNow)+ ".png";

        File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try {
            FileHandler.copy(screenShot,new File("C:\\Users\\Марк\\IdeaProjects\\selenium\\Screenshots\\"+fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
       driver.quit();








    }
}
