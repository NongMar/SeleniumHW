package SeleniumHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW06CheckMultiBox {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");


        List<WebElement> checkBtns=driver.findElements(By.xpath("//input [@class='cb1-element']"));

        for(WebElement checkBtn:checkBtns){
            String options=checkBtn.getAttribute("value");
            if(options.equalsIgnoreCase("Option-3")){
                checkBtn.click();
            }
        }

    }
}
