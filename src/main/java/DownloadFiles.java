import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFiles {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Марк\\IdeaProjects\\selenium\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/imghp?hl=en");
        WebElement linkImage =driver.findElement(By.xpath("//span[@class=\"S3Wjs\"]"));
        linkImage.click();
        WebElement uploadFile=driver.findElement(By.xpath("//a[text()='Upload an image']"));
        WebElement choosingFile= driver.findElement(By.xpath("//input[@type='file']"));
        choosingFile.sendKeys("C:\\Users\\Марк\\IdeaProjects\\selenium\\Screenshots\\screen.png");



    }
}
