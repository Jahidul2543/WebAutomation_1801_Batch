package tests.page.objects;

import application.page.base.ApplicationBasePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.SignInPage;
import xlsx.reader.MyDataReader;

import java.io.File;


public class SignInPageTest extends ApplicationBasePage {

   HomePage objHomePage =null;
    SignInPage objSignInPage = null;

    @BeforeMethod
    public void initElements(){

        objHomePage = PageFactory.initElements(driver, HomePage.class);
        objSignInPage = PageFactory.initElements(driver, SignInPage.class);
    }

    @DataProvider
    public Object[][] testData() throws Exception {

       // File filepath = new File("/Users/jahidul/IdeaProjects/WebAutomation_1801_Batch/automationpractice/testData/TestData.xlsx");

        File filepath = new File(System.getProperty("user.dir") +  "/testData/TestData.xlsx");

        MyDataReader dr = new MyDataReader();

        //Show me where is data file
        dr.setExcelFile(filepath.getAbsolutePath());

        String[][] data = dr.getExcelSheetData("Sheet3");

        return data;

    }

    @Test (dataProvider = "testData")
    public void invalidCredentialTest(String email, String password, String expectedErroMessage){

        objHomePage.clickSignIn();

        objSignInPage.login(email, password);

       String actualErrorMessage = objSignInPage.verifyErrorMessage();

        Assert.assertEquals(actualErrorMessage, expectedErroMessage);

    }

}
