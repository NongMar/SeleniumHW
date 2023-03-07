package SeleniumReviews;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Review01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
    WebDriver driver=new ChromeDriver();

    driver.get("https://www.google.com/");

    String pageTitle=driver.getTitle();
        System.out.println("The title is: "+ pageTitle);

    }
}