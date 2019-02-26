package pageobjects;

import application.page.base.ApplicationBasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage {


    @FindBy(className = "login")
    private WebElement signIn;


    public void clickSignIn(){

      signIn.click();

    }

    public boolean checkElementsStatus(){

       boolean status = signIn.isDisplayed();

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