import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DifferentBrowsers {
    public static void main(String []args){
     //   System.setProperty("webdriver.gecko.driver","C:\\Users\\Марк\\IdeaProjects\\selenium\\drivers\\geckodriver.exe");
        System.setProperty("webdriver.edge.driver","C:\\Users\\Марк\\IdeaProjects\\selenium\\drivers\\msedgedriver.exe");
    //    WebDriver driver =new FirefoxDriver();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/imghp?hl=en");

    }

}
