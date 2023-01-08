import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowsHandling {

    @Test
    public void windowsHandle(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ssant\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.navigate().to("https://www.leafground.com/window.xhtml");

      /*  String oldWindow = driver.getWindowHandle();

        driver.findElement(By.id("j_idt88:new")).click();

        Set<String> openedWindows   = driver.getWindowHandles();
        openedWindows.stream().forEach(s->driver.switchTo().window(s));

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();*/

      /*  WebElement element = driver.findElement(By.id("j_idt88:j_idt91"));
        clickOn(driver,element,Duration.ofSeconds(30));

        Set<String> windowsOpened = driver.getWindowHandles();
        System.out.print(windowsOpened.size());*/

        String oldWindow = driver.getWindowHandle();

        WebElement element =  driver.findElement(By.id("j_idt88:j_idt93"));
        clickOn(driver,element,Duration.ofSeconds(30));

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Set<String> openedWindows = driver.getWindowHandles();

        for(String s:openedWindows){
            if(!s.equals(oldWindow)){
                driver.switchTo().window(s);
                driver.close();
            }
        }


    }

    public void clickOn(WebDriver driver, WebElement element, Duration timeOut){
        new WebDriverWait(driver,timeOut).until(ExpectedConditions.visibilityOf(element)).click();
    }
}
