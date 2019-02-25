package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestNG;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YahooTest {

//    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//      //  cannot use this main method run the code as TestNG
//    }

    @BeforeMethod
    public void setUps(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.yahoo.com");
    }
    @Test(priority = 1)
    public void firstTest(){



    }

    @Test(priority = 5)
    public  void secondTest(){

    }

    @Test(priority = 6)
    public  void thirdTest(){

    }


}
