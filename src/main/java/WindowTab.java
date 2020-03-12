import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowTab {
    public static void main(String []args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Марк\\IdeaProjects\\selenium\\drivers\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1562628050&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3d02eea380-9518-a6e0-fdb6-be2782d5a8c2&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
               String nameOfWindow =driver.getWindowHandle();
                WebElement link1= driver.findElement(By.xpath("//a[text() = 'Terms of use']"));
               link1.click();

               for(String tab:driver.getWindowHandles()){
                   driver.switchTo().window(tab);

               }
               driver.manage().window().maximize();
               Actions actions= new Actions(driver);
              WebElement link2= driver.findElement(By.xpath("//a[text()='Microsoft Privacy Statement']"));
               actions.moveToElement(link2).build().perform();

               driver.switchTo().window(nameOfWindow);
               driver.findElement(By.xpath("//input[@placeholder='Email, phone, or Skype']")).sendKeys("привет");
               driver.findElement(By.xpath("//a[text()='Sign-in options']")).click();




    }
}
