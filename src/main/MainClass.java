import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class MainClass {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Марк\\IdeaProjects\\selenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
     MainPage mainPage =new MainPage(driver);
       // MainPage mainPage = PageFactory.initElements(driver,MainPage.class);
        driver.get("https://github.com/");


       // SignUpPage signUpPage=mainPage.register("fiasd421","4fdfs@vd.dw","111111111111111");
        LogInPage logInPage = mainPage.clickSignIn();
        logInPage.loginWithInvalidCreds("","");








    }
}
