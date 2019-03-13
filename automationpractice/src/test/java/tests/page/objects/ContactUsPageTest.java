package tests.page.objects;

import application.page.base.ApplicationBasePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.ContactUsPage;
import pageobjects.HomePage;
import pageobjects.SignInPage;
import xlsx.reader.MyDataReader;

import java.io.File;


public class ContactUsPageTest extends ApplicationBasePage {

   HomePage objHomePage =null;
    ContactUsPage objContactPage = null;

    @BeforeMethod
    public void initElements(){

        objHomePage = PageFactory.initElements(driver, HomePage.class);
        objContactPage = PageFactory.initElements(driver, ContactUsPage.class);
    }



    @Test
    public void invalidCredentialTest(){

        objHomePage.clickContactUs();
        objContactPage.dropDownDemo();

       /* String actualErrorMessage = objSignInPage.verifyErrorMessage();

        Assert.assertEquals(actualErrorMessage, expectedErroMessage);*/

    }
}
