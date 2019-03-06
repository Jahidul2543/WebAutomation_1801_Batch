package pageobjects;

import application.page.base.ApplicationBasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage {


    @FindBy(className = "login")
    private WebElement signIn;


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