import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Button {

    @Test
    public void button(){
        //j_idt88:j_idt92
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ssant\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to("https://www.leafground.com/button.xhtml");
       /* WebElement element  = driver.findElement(By.id("j_idt88:j_idt92"));
        if(element.isEnabled())
            System.out.print("is Enabled");
        else
            System.out.print("disabled");*/

        /*WebElement element = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']//span"));
        String s  = element.getCssValue("color");
        System.out.print(s);*/

        //driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']//following::span")).getSize().getHeight();

     /*  WebElement element =  driver.findElement(By.id("j_idt88:j_idt100"));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
*/

        List<WebElement> elements = driver.findElements(By.xpath("//h5[text()=" +
                "'How many rounded buttons are there?']//following::button"));
        System.out.print(elements.size());

    }
}
