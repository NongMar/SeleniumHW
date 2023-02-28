package SeleniumHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HW02 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("John");
        driver.findElement(By.id("customer.lastName")).sendKeys("Smith");
        driver.findElement(By.id("customer.address.street")).sendKeys("111,Some St");
        driver.findElement(By.id("customer.address.city")).sendKeys("NYC");
        driver.findElement(By.id("customer.address.state")).sendKeys("NY");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("111");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("212-555-555");
        driver.findElement(By.id("customer.ssn")).sendKeys("999-999-99");
        driver.findElement(By.id("customer.username")).sendKeys("JSmith");
        driver.findElement(By.id("customer.password")).sendKeys("password111");
        driver.findElement(By.id("repeatedPassword")).sendKeys("password111");
        Thread.sleep(3000);
        driver.quit();



    }

}
