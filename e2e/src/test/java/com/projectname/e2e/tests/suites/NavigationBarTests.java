package com.projectname.e2e.tests.suites;

import com.projectname.e2e.tests.data.enums.Country;
import com.projectname.e2e.tests.pages.DemoPage;
import com.projectname.e2e.tests.pages.FlightsPage;
import com.projectname.e2e.tests.pages.NavigationBarPage;
import com.projectname.e2e.tests.suites.common.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationBarTests extends TestBase {

    @Test
    public void verifyDemoButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        DemoPage demoPage = navigationBarPage.openDemoPage();

        Assert.assertTrue(demoPage.isDisplayed());
    }

    @Test
    public void verifyFlightsButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");

        FlightsPage flightsPage = navigationBarPage.openFlightsPage();

        Assert.assertTrue(flightsPage.isDisplayed());

    }
}
