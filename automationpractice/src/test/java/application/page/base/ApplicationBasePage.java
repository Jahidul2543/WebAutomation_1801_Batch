package application.page.base;

import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import reporting.TestLogger;

public class ApplicationBasePage extends BrowserDriver {

   /**
    *
    * This class will have all common methods which is not related to creating specific browser
    *
    * */

   public static boolean isDisplayed(WebElement element, String elemtntName){

       TestLogger.log("Checking " + elemtntName);
       boolean status = element.isDisplayed();
       return status;
   }

    public static void sendKeys(WebElement webElement, String webElementName, String keys){
        webElement.clear();
        TestLogger.log("Sending " + keys + " to " + webElementName);
        webElement.sendKeys(keys);
        TestLogger.log("Keys Sent to " + webElementName);
    }

    public static void click(WebElement webElement, String webElementName){

       TestLogger.log("Click " + webElementName );

        webElement.click();

        TestLogger.log("Clicked " + webElementName);
    }

    /**
     * Explicitly wait
     * */
    public static void waitUntilElementIsVisible(WebElement element, int waitTime ){

        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

}
