package Selenium01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {


    public static void main(String[] args) throws InterruptedException {


        //tell your project where the webdriver is located
      System.setProperty("webdriver.chrome.driver","drivers/chromedriver");


      //create an instance of web driver

        WebDriver driver=new ChromeDriver();

        //open the webstie google.com
        driver.get("https://www.facebook.com/");

        //get the current url that is there in the browser
        String URL=driver.getCurrentUrl();
                //print out the url

        System.out.println(URL);
        //print the title of the page

        String title=driver.getTitle();

        System.out.println("the title of this page is"+ title);

        Thread.sleep(3000);

//close the browser
        driver.quit();

    }

}
