import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

public class MainClass2 {
    static WebDriver driver;

public static void main(String []args){

    System.setProperty("webdriver.chrome.driver","C:\\Users\\Марк\\IdeaProjects\\selenium\\drivers\\chromedriver.exe");
/*    driver= new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.manage().window().maximize();*/
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
    ChromeDriver driver = new ChromeDriver(options);

    driver.get("http://www.w3schools.com/html/html_tables.asp");
    WebDriverWait wait = new WebDriverWait(driver,5);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1//span[contains(text(), 'Tables')]")));

    WebElement tableElement = driver.findElement(By.xpath("//table[@id=\"customers\"]"));

    Table table = new Table(tableElement, driver);

    System.out.println("Rows number is: " + table.getRows().size());

    System.out.println(table.getValueFromCell(2, 3));
    System.out.println(table.getValueFromCell(4, 1));

    System.out.println(table.getValueFromCell(4, "Company"));
    System.out.println(table.getValueFromCell(1, "Country"));
    System.out.println(table.getValueFromCell(2, "Contact"));


    driver.quit();

}
}
