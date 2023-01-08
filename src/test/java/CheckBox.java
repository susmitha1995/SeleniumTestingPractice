import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckBox {

    @Test
    public void checkBox(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ssant\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.leafground.com/checkbox.xhtml");
        /*List<WebElement> elementList = driver.findElements(By.xpath("//table[@id='j_idt87:basic']//div//span//parent::div"));
       //System.out.print(elementList.size());
      elementList.stream().forEach(m->m.click());*/

        Boolean b=driver.findElement(By.xpath("//table[@id='j_idt87:basic']//span")).isEnabled();

        if(b==false)
            System.out.print("isDiabled");
        else
            System.out.print("isEnabled");
        Assert.assertEquals(true,false);


    }
}
