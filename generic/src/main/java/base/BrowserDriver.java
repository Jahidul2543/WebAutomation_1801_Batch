package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;


//import org.apache.maven.surefire.shade.org.apache.maven.shared.utils.io.FileUtils;

public class BrowserDriver {

    public static WebDriver driver = null;

    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","/Users/jahidul/IdeaProjects/WebAutomation_1801_Batch/generic/drivers/mac/chromedriver");

        // ChromDriver Reference variable or object, in simple we say driver object
        driver   = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
