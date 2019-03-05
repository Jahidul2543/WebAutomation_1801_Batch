package tests.page.objects;

import application.page.base.ApplicationBasePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;


public class HomePageTest extends ApplicationBasePage {

    /**
     * Open url> Done>  driver.get("url")
     * Click sign in> write invalid email>invalid  password> click submit button > verify the text
     */

    HomePage objHomePage;


    @BeforeMethod
    public void initElements(){

      objHomePage = PageFactory.initElements(driver, HomePage.class);

    }

    @Test
    public void checkElements(){

        boolean status = objHomePage.checkElementsStatus();

        // Hard Assertion
        Assert.assertEquals(status, true);








    }



}
