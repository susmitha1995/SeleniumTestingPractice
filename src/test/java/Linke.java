import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.sql.Time;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Linke {

    @Test
    public void links() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ssant\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to("https://www.leafground.com/link.xhtml;jsessionid=node04mf4sy2euqwl1x2qz2cdyiu7c479367.node0");
        WebElement dashboardElement  = driver.findElement(By.xpath("//a[@class='ui-link ui-widget']"));
        clickOn(driver,dashboardElement, Duration.ofSeconds(10));
        driver.navigate().back();
        Thread.sleep(4000);
      /*  WebElement webElement = driver.findElement(By.xpath("//a[text()='Find the URL without clicking me.']"));
        String s  = webElement.getAttribute("href");


       WebElement broken = driver.findElement(By.xpath("//a[@text()='Broken?']"));
       clickOn(driver,broken,Duration.ofSeconds(30));

       String s1 = driver.getTitle();
       System.out.print(s1);*/

        List<WebElement> lists= driver.findElements(By.tagName("a"));

       int  i =lists.size();
        System.out.print(i);
    }

    public void clickOn(WebDriver driver,WebElement element,Duration timeOut){
        new WebDriverWait(driver,timeOut).until(ExpectedConditions.visibilityOf(element)).click();
    }
}
