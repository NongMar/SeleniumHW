package SeleniumHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW04 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");


        WebElement msg=driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']"));
        msg.sendKeys("Welcome!!!!!");
        WebElement show=driver.findElement(By.xpath("//button[text()='Show Message']"));
       show.click();
          WebElement valueA=driver.findElement(By.xpath("//input[@id='sum1']"));
valueA.sendKeys("2");

       WebElement valueB=driver.findElement(By.xpath("//input[@id='sum2']"));
valueB.sendKeys("2");

     WebElement click=driver.findElement(By.xpath("//button[contains(text(),'Get T')]"));
click.click();
WebElement total= driver.findElement(By.xpath("//span[@id='displayvalue']"));
        System.out.println(total.getText());


    }
}
