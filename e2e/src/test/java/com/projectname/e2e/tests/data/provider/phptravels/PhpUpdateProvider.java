package com.projectname.e2e.tests.data.provider.phptravels;

import com.projectname.api.client.utils.RandomStringGenerator;
import com.projectname.e2e.tests.data.enums.Country;
import com.projectname.e2e.tests.data.model.RegisterUserRequest;
import com.projectname.e2e.tests.data.model.UpdateUserRequest;

public class PhpUpdateProvider {

    public static UpdateUserRequest updateUserRequest() {
        UpdateUserRequest updateRequest = new UpdateUserRequest();

        updateRequest.setFirstName(RandomStringGenerator.createRandomStringAlphabeticWithLen(8));
        updateRequest.setLastName(RandomStringGenerator.createRandomStringAlphabeticWithLen(8));
        updateRequest.setEmail(RandomStringGenerator.createRandomEmailWithPrefixLen(8));
        updateRequest.setPhoneNumber(RandomStringGenerator.createRandomStringNumericWithLen(7));
        updateRequest.setAddress(RandomStringGenerator.createRandomStringAlphabeticWithLen(8));
        updateRequest.setAddress2(RandomStringGenerator.createRandomStringAlphabeticWithLen(8));
        updateRequest.setCity(RandomStringGenerator.createRandomStringAlphabeticWithLen(8));
        updateRequest.setState(RandomStringGenerator.createRandomStringAlphabeticWithLen(8));
        updateRequest.setPostalCode(RandomStringGenerator.createRandomStringNumericWithLen(6));

        return updateRequest;
    }
}
