import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ListBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Марк\\IdeaProjects\\selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://market.yandex.ru/catalog--stiralnye-mashiny/16673392/list?catId=90566&hid=90566");

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//div[@class = '_2Hue1bCg-N'][3]//span[@class ='NVoaOvqe58']"));

        System.out.println(checkBoxes.size());
        for( WebElement i:checkBoxes){
            i.click();

        }


    }
}
