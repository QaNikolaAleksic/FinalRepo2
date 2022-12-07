package com.projectname.e2e.tests.pages;

import com.projectname.e2e.tests.pages.common.PageBase;
import com.projectname.e2e.tests.selectors.CustomBy;
import com.projectname.e2e.tests.utils.CheckIfElement;
import com.projectname.e2e.tests.webdriver.CustomWebDriver;
import org.openqa.selenium.WebElement;

public class NavigationBarPage extends PageBase {
    public NavigationBarPage(CustomWebDriver driver, String url, String email, String password) {
        super(driver, url, email, password);
    }

    @Override
    public PageBase show() {
        return null;
    }

    @Override
    public boolean isDisplayed() {
        return CheckIfElement.isDisplayed(CustomBy.id("PHPTRAVELS"), driver);
    }

    private WebElement getDemoBtn() {
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/a[1]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find demo button on Navigation bar page", e);
        }
    }

    public DemoPage openDemoPage() {
        getDemoBtn().click();
        return new DemoPage(driver, url, email, password);
    }

    private WebElement getFeaturesBtn() {
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[1]/span"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find features button on Navigation bar page", e);
        }
    }

    private WebElement getFlightsBtn() {
        getFeaturesBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/div[1]/div/a[3]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find flights button on Navigation bar page", e);
        }
    }

    public FlightsPage openFlightsPage() {
        getFlightsBtn().click();
        return new FlightsPage(driver, url, email, password);
    }

    private WebElement getSignupButton() {
        try {
            return driver.findElement(CustomBy.xpath("/html/body/header/div/nav/a[5]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find signup button on Navigation bar page", e);
        }
    }

    public SignupPage openSignupPage() {
        getSignupButton().click();
        return new SignupPage(driver, url, email, password);
    }

}
