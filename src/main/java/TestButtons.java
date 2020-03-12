import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestButtons {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Марк\\IdeaProjects\\selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com/");
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        WebElement signButton2=driver.findElement(By.xpath("//div/div/div/div/form//button"));
        WebElement signButton= driver.findElement(By.xpath("//label[@class = \"uiButton uiButtonConfirm\"]"));
        if(signButton.equals(signButton2)){
            System.out.println("Success");}
        System.out.println(signButton.getText());
        signButton.submit();
/*
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        WebElement trendButton = driver.findElement(By.linkText("Trending"));
        trendButton.click();
*/





    }
}
