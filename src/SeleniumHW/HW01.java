package SeleniumHW;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HW01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.amazon.com/");
        String title=driver.getTitle();
        System.out.println(title);
        driver.quit();

    }
}
