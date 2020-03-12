import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Марк\\IdeaProjects\\selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html");
        driver.findElement(By.xpath("//a[text()='jdk-8u211-windows-x64.exe']")).click();
        try{
           Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        driver.switchTo().alert().accept();

        driver.get("https://www.google.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("confirm('Are you sure')");
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        driver.switchTo().alert().dismiss();


    }
}
