package com.projectname.e2e.tests.suites;

import com.projectname.e2e.tests.asserts.PhpTravelAssert;
import com.projectname.e2e.tests.data.model.RegisterUserRequest;
import com.projectname.e2e.tests.data.model.UpdateUserRequest;
import com.projectname.e2e.tests.data.model.UserPageDetails;
import com.projectname.e2e.tests.data.provider.phptravels.PhpTravelsProvider;
import com.projectname.e2e.tests.data.provider.phptravels.PhpUpdateProvider;
import com.projectname.e2e.tests.pages.*;
import com.projectname.e2e.tests.suites.common.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateTests extends TestBase {

    @Test
    public void verifyUserIsUpdated() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");
        navigationBarPage.show();

        SignupPage signupPage = new SignupPage(getDriver(), "", "", "");
        signupPage.show();

        RegisterUserRequest userRequest = PhpTravelsProvider.prepareRegisterUserRequest();

        UserPage userPage = signupPage.registerNewUser(userRequest);

        UpdatePage updatePage = userPage.openUpdatePage();

        Assert.assertTrue(updatePage.isDisplayed());

        UpdateUserRequest updateRequest = PhpUpdateProvider.updateUserRequest();

        updatePage.updateUser(updateRequest);

        UserPageDetails actualUserDetails = userPage.getActualUserDetails();

        UserPageDetails expectedUserDetails = UserPageDetails.parseExpectedUserDetails(userRequest);

        PhpTravelAssert phpTravelAssert = new PhpTravelAssert();
        phpTravelAssert.assertUserDataOnUserPage(actualUserDetails, expectedUserDetails);

    }
}
