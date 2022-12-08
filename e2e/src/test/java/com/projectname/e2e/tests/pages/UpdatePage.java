package com.projectname.e2e.tests.pages;

import com.projectname.e2e.tests.data.model.RegisterUserRequest;
import com.projectname.e2e.tests.data.model.UpdateUserRequest;
import com.projectname.e2e.tests.pages.common.PageBase;
import com.projectname.e2e.tests.selectors.CustomBy;
import com.projectname.e2e.tests.utils.CheckIfElement;
import com.projectname.e2e.tests.webdriver.CustomWebDriver;
import org.openqa.selenium.WebElement;

public class UpdatePage extends PageBase {

    public UpdatePage(CustomWebDriver driver, String url, String email, String password) {
        super(driver, url, email, password);
    }

    @Override
    public PageBase show() {
        return null;
    }

    @Override
    public boolean isDisplayed() {
        return CheckIfElement.isDisplayed(CustomBy.xpath("//*[@id=\"main-body\"]/div/div[1]/div[2]/form/div[1]/div/h3"), driver);
    }

    private WebElement getInputFirstNameField() {
        try {
            return driver.findElement(CustomBy.id("inputFirstName"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find input first name field on Signup page", e);
        }
    }

    private WebElement getLastNameField() {
        try {
            return driver.findElement(CustomBy.id("inputLastName"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find last name field on Signup page", e);
        }
    }

    private WebElement getEmailField() {
        try {
            return driver.findElement(CustomBy.id("inputEmail"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find email field on Signup page", e);
        }
    }

    private WebElement getInputPhoneField() {
        try {
            return driver.findElement(CustomBy.id("inputPhone"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find phone field on Update page", e);
        }
    }

    private WebElement getStreetAddressField() {
        try {
            return driver.findElement(CustomBy.id("inputAddress1"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find street address field on Update page", e);
        }
    }

    private WebElement getStreetAddress2Field() {
        try {
            return driver.findElement(CustomBy.id("inputAddress2"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find street address 2 field on Update page", e);
        }
    }

    private WebElement getCityField() {
        try {
            return driver.findElement(CustomBy.id("inputCity"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find city field on Update page", e);
        }
    }

    private WebElement getStateField() {
        try {
            return driver.findElement(CustomBy.id("stateinput"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find state field on Update page", e);
        }
    }

    private WebElement getPostcodeField() {
        try {
            return driver.findElement(CustomBy.id("inputPostcode"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find postcode field on Update page", e);
        }
    }


    private WebElement getSaveChangesButton() {
        try {
            return driver.findElement(CustomBy.xpath("//*[@id=\"main-body\"]/div/div[1]/div[2]/form/div[4]/input[1]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find save changes button on Update page", e);
        }
    }

    public UserPage updateUser(UpdateUserRequest updateRequest) {

        getInputFirstNameField().click();
        getInputFirstNameField().clear();
        getInputFirstNameField().sendKeys(updateRequest.getFirstName());

        getLastNameField().click();
        getLastNameField().clear();
        getLastNameField().sendKeys(updateRequest.getLastName());

        getEmailField().click();
        getEmailField().clear();
        getEmailField().sendKeys(updateRequest.getEmail());

        getInputPhoneField().click();
        getInputPhoneField().clear();
        getInputPhoneField().sendKeys(updateRequest.getPhoneNumber());

        getStreetAddressField().click();
        getStreetAddressField().clear();
        getStreetAddressField().sendKeys(updateRequest.getAddress());

        getStreetAddress2Field().click();
        getStreetAddress2Field().clear();
        getStreetAddress2Field().sendKeys(updateRequest.getAddress2());

        getCityField().click();
        getCityField().clear();
        getCityField().sendKeys(updateRequest.getCity());

        getStateField().click();
        getStateField().clear();
        getStateField().sendKeys(updateRequest.getState());

        getPostcodeField().click();
        getPostcodeField().clear();
        getPostcodeField().sendKeys(updateRequest.getPostalCode());

        getSaveChangesButton().click();

        return new UserPage(driver, url, email, password);
    }
}
