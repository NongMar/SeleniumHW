package SeleniumClass04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class radioButtons {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");



        WebElement maleBtn=driver.findElement(By.cssSelector("input[value='Male']"));
        boolean isEn= maleBtn.isEnabled();
        System.out.println("button is enabled "+ isEn);
        boolean isDisp=maleBtn.isDisplayed();
        boolean isSel=maleBtn.isSelected();

        if(!isSel) {

            maleBtn.click();
        }

        isSel=maleBtn.isSelected();
        System.out.println(isSel);
    }
}
