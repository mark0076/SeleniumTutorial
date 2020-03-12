import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ItemAvability {
    public static void main(String []args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Марк\\IdeaProjects\\selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://market.yandex.ru/?clid=505&utm_source=face_abovesearch&utm_campaign=face_abovesearch");
        driver.manage().window().maximize();
        WebElement menuItem = driver.findElement(By.xpath("//span[text()='Все категории']"));
        menuItem.click();
        WebElement button = driver.findElement(By.xpath("//button[@class=\"button2 button2_size_ml button2_type_submit button2_pin_brick-round i-bem suggest2-form__button button2_theme_gray button2_js_inited\"]"));
        System.out.println(button.isEnabled());
        Actions mouseРover = new Actions(driver);
        mouseРover.moveToElement(menuItem).contextClick();
        WebElement searchField =driver.findElement(By.xpath("//input[@id='header-search']"));
        searchField.sendKeys("привет");
        searchField.clear();
        menuItem.click();


        driver.get("https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html");
        WebElement radio =driver.findElement(By.xpath("//input[@onclick=\"acceptAgreement(window.self, 'jdk-8u211-oth-JPR');\"]"));
        System.out.println("rb1"+radio.isSelected());
        WebElement radio2 =driver.findElement(By.xpath("//input[@onclick=\"declineAgreement(window.self, 'jdk-8u211-oth-JPR');\"]"));
        System.out.println("rb2"+radio2.isSelected());

        if(!radio.isSelected()){
            radio.click();

        }
driver.get("https://www.ebay.com/");

        WebElement el1 =driver.findElement(By.xpath("//li/a[text()='Электроника']"));
         WebElement el12 =driver.findElement(By.xpath("//li/a[text()='Одежда для нее']"));
        System.out.println("el1 is" +el1.isDisplayed());
        System.out.println("el12 is" +el12.isDisplayed());




    }
}
