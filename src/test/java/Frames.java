import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Frames {

    @Test
    public void frames(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ssant\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.navigate().to("https://www.leafground.com/frame.xhtml");
        /*driver.switchTo().frame(0);
        WebElement element = driver.findElement(By.id("Click"));
        clickOn(driver,element,Duration.ofSeconds(20));
        System.out.print(element.getText());*/
        /*List<WebElement> elementList = driver.findElements(By.tagName("iframe"));
        System.out.print(elementList.size());*/
        driver.switchTo().frame(1);
        driver.switchTo().frame("frames2");
        driver.findElement(By.id("Click")).click();
    }

    public void clickOn(WebDriver driver, WebElement element, Duration timeOut){
        new WebDriverWait(driver,timeOut).until(ExpectedConditions.visibilityOf(element)).click();
    }
}
