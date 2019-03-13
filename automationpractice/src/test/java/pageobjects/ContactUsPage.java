package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {

    @FindBy(id="id_contact")
    private WebElement choose;

    public void dropDownDemo(){
        Select select = new Select(choose);
        select.selectByIndex(1);
    }

}
