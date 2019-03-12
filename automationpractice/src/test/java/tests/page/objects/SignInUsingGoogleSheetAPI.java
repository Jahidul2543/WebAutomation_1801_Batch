package tests.page.objects;

import base.BrowserDriver;
import google.sheet.api.GoogleSheetReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.SignInPage;


public class SignInUsingGoogleSheetAPI extends BrowserDriver {

    HomePage objHomePage =null;
    SignInPage objSignInPage = null;

    @BeforeMethod
    public void initElements(){

        objHomePage = PageFactory.initElements(driver, HomePage.class);
        objSignInPage = PageFactory.initElements(driver, SignInPage.class);
    }

    @DataProvider
    public Object[][] testData() throws Exception {

        String sheetId = "1AEVTjDK-RVcr0-DlAkTlW1HlsyqTOiCA1vS3Adrh230";
        String range = "Sheet1!A2:D";
        GoogleSheetReader gst = new GoogleSheetReader();
        String[][] data = gst.getSpreadSheetRecordsToSupplyDataProvider(sheetId, range);
        return data ;

    }

    @Test(dataProvider = "testData")
    public void invalidCredentialTest(String password , String email, String expectedErroMessage){
           //String password, String email, String expectedErroMessage

        objHomePage.clickSignIn();

        objSignInPage.login(email, password);

        String actualErrorMessage = objSignInPage.verifyErrorMessage();

        Assert.assertEquals(actualErrorMessage, expectedErroMessage);

    }

}
