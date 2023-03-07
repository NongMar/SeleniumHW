package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW05CheckOneBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        WebElement checkBtn= driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
       boolean isSelected= checkBtn.isSelected();

        if(!isSelected){
            checkBtn.click();
        }
    }
    //
}
