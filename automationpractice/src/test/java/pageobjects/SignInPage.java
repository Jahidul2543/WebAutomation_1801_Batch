package pageobjects;

import application.page.base.ApplicationBasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.List;

public class SignInPage{

    @FindBy(id ="email")
    private WebElement emailBox ;

    @FindBy(id = "passwd")
    private WebElement passwordBox;

    @FindBy(name = "SubmitLogin")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@id='center_column']/div[1]/p")
    private WebElement errorMessage;

    @FindBy(tagName = "input")
    private List<WebElement> inputTags;


    public void login(String email, String password){


        // emailBox.sendKeys("abcd@Ggmail.com");
        //password.sendKeys("123abcd");

        ApplicationBasePage.sendKeys(emailBox,"emailBox", email );
        ApplicationBasePage.sendKeys(passwordBox, "password", password);

        ApplicationBasePage.click(submitButton, "submitButton");


    }

    public void loginUsingListOfElements(String email, String password){
        int size = inputTags.size();
        System.out.println(size);

        ApplicationBasePage.sendKeys(inputTags.get(7),"emailBox", email );
        ApplicationBasePage.sendKeys(inputTags.get(8), "password", password);

        ApplicationBasePage.click(submitButton, "submitButton");

    }


    public String verifyErrorMessage(){

        String actualErrorMessage = errorMessage.getText();
        return actualErrorMessage;

    }



}
