package class02;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class locatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");


        //create an instance of web driver

        WebDriver driver=new ChromeDriver();

        //open up fb.com
        driver.get("https://www.facebook.com/");

        //send in the username
        driver.findElement(By.id("email")).sendKeys("marcin");
        driver.findElement(By.name("pass")).sendKeys("something");
        //driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.partialLinkText("password?")).click();
        driver.quit();



    }


}
