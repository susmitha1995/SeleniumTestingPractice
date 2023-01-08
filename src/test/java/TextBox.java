import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class TextBox {

    @Test
    public void textBox() throws AWTException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ssant\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.leafground.com/input.xhtml");
       /* WebElement username= driver.findElement(By.id("j_idt88:name"));
        sendKeys(driver,username,Duration.ofSeconds(30),"Susmitha");

        WebElement append=driver.findElement(By.id("j_idt88:j_idt91"));
        sendKeys(driver,append,Duration.ofSeconds(30),"India");*/


        /*WebElement shadowHost = getDriver ().findElement (By.id ("shadow_host"));
        SearchContext shadowRoot = shadowHost.getShadowRoot ();
        WebElement shadowContent = shadowRoot.findElement (By.cssSelector ("#nested_shadow_host"));*/


        /*driver.findElement(By.id("j_idt88:j_idt95")).clear();

        WebElement text= driver.findElement(By.id("j_idt88:j_idt97"));
        String s  = text.getAttribute("value");
        System.out.print(s);*/

        /*driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("susmitha.rev@gmail.com");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);*/

       /* driver.findElement(By.id("j_idt106:thisform:age")).click();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);*/

        driver.findElement(By.id("j_idt106:j_idt116_input")).click();
        driver.findElement(By.xpath("//*[text()='12']")).click();

        //invisible dropdown
        //Fn+F8 //sources->EventListeners


    }


    public void sendKeys(WebDriver driver, WebElement element, Duration timeOut, String sendKey){

        new WebDriverWait(driver,timeOut).until(ExpectedConditions.visibilityOf(element)).sendKeys(sendKey);

    }

}
