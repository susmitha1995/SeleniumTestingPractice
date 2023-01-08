import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Alerts {

    @Test
    public void alerts(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ssant\\Downloads\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.leafground.com/alert.xhtml");
        /*WebElement element = driver.findElement(By.id("j_idt88:j_idt91"));
        element.click();
        driver.switchTo().alert().accept();
        String s  = driver.findElement(By.id("simple_result")).getText();
        System.out.print(s);*/

       /* driver.findElement(By.xpath("//*[@id='j_idt88:j_idt104']//span[2]")).click();
        Alert alert= driver.switchTo().alert();
        alert.sendKeys("susmitha");
        alert.accept();
        String s = driver.findElement(By.id("confirm_result")).getText();
        System.out.print(s);*/

        driver.findElement(By.xpath("//*[@id='j_idt88:j_idt111']//span[2]")).click();
        Alert alert = driver.switchTo().alert();
        driver.manage().window().maximize();


    }
}
