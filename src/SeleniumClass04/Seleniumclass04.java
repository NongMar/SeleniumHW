package SeleniumClass04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Seleniumclass04 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        WebElement clickBtn=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        clickBtn.click();
        Thread.sleep(1000);
        WebElement firstName= driver.findElement((By.cssSelector("input[name='firstname']")));
        firstName.sendKeys("Bob");

    }
}
