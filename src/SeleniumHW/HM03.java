package SeleniumHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HM03 {
    public static void main(String[] args)throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("https://facebook.com");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Dow");
        driver.findElement(By.name("reg_email__")).sendKeys("jdow@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("jdow@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("password111");
        driver.findElement(By.name("birthday_day")).sendKeys("5");
        driver.findElement(By.name("birthday_month")).sendKeys("Sep");
        driver.findElement(By.name("birthday_year")).sendKeys("1990");
        driver.findElement(By.className("_58mt")).click();
        driver.findElement(By.name("websubmit")).click();

        Thread.sleep(4000);
        driver.close();
        driver.quit();
    }
}
