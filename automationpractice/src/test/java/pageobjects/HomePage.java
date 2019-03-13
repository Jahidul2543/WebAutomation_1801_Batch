package pageobjects;

import application.page.base.ApplicationBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;


public class HomePage {


    @FindBy(className = "login")
    private WebElement signIn;

    @FindBy(linkText = "Contact us")
   private WebElement contactUs;

    public void clickContactUs() {

        contactUs.click();

    }


    public void clickSignIn() {
      //signIn.click();
        ApplicationBasePage.click(signIn,"signIn" );

    }

    public boolean checkElementsStatus(){

       boolean status = ApplicationBasePage.isDisplayed(signIn, "signIn");

        return status;
    }
}


/**
 *
 * private HomePage object;
 *
 * object = new HomePage();
 *
 * */