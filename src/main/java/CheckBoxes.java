import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckBoxes {
    static WebDriver driver;
    public static void main (String [] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Марк\\IdeaProjects\\selenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://market.yandex.ru/");
        driver.findElement(By.xpath("//a[@class =\"link n-w-tab__control b-zone b-spy-events\" and@href=\"/catalog--bytovaia-tekhnika/54419\" ] ")).click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text() ='Стиральные машины']")).click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        selectCheckBox("ATLANT");
        selectCheckBox("Bosch");
        selectCheckBox("Electrolux");
        selectCheckBox("LG");
        selectRadioButton("Самовывоз");
        selectRadioButton("С доставкой");

    }
    public static void selectCheckBox(String name){
        String xPath1 ="//input[@name ='Производитель %s']";
        String xPath2 ="//span[@class ='NVoaOvqe58'and text()='%s']";
        if(!driver.findElement(By.xpath(String.format(xPath1,name))).isSelected()) {
            driver.findElement(By.xpath(String.format(xPath2,name))).click();
        }

    }
    public static void selectRadioButton(String name){
        String xPath="//span[text()='%s']";
        driver.findElement(By.xpath(String.format(xPath,name))).click();


    }
}
