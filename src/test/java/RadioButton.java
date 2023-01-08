import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import javax.sound.midi.SysexMessage;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

class radioButtonObjects{

    @FindBy(xpath = "//*[@id='j_idt87:city2']//span")
    public static WebElement radioButton;
}

public class RadioButton {

    @Test
    public void radioButton(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ssant\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.leafground.com/radio.xhtml");

      //  List<WebElement> elementList = driver.findElements(By.xpath("//*[@id='j_idt87:city2']//input"));
        // System.out.print(elementList.get(0).getAttribute("value"));

       // elementList.stream().filter(m->!m.isSelected()).map(m->m.getAttribute("value")).forEach(s->System.out.print(s));
       /* for(WebElement element:elementList)
        {
            if(!element.isSelected())
               System.out.print(element.getAttribute("value")+" ");
        }*/

        List<WebElement>elementList = driver.findElements(By.xpath("//table[@id='j_idt87:console2']//input"));
        for(WebElement element:elementList)
        {
            if(!element.isSelected()) {
                element.click();
                break;
            }

        }



    }
}
