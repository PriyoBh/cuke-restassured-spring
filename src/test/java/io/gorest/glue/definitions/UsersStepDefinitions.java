package io.gorest.glue.definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.gorest.helpers.APIHelper;
import io.gorest.models.User;
import io.gorest.state.UserState;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsersStepDefinitions {

    @Autowired
    private APIHelper apiHelper;

    @Autowired
    private UserState userState;

    @When("I call the endpoint {string}")
    public void iCallTheEndpoint(String endPoint) {
        userState.setUsers(apiHelper.get(endPoint).jsonPath().getList(".", User.class));
        System.out.println("When state is completed");
    }

    @Then("Each user entry should have the following attributes populated: name, email, gender, status")
    public void classifierEntryCodesShouldBe() {
        List<String> emails = userState.getUsers().stream().map(User::getEmail).collect(Collectors.toList());
        List<String> names = userState.getUsers().stream().map(User::getName).collect(Collectors.toList());
        List<String> genders = userState.getUsers().stream().map(User::getGender).collect(Collectors.toList());
        List<String> statuses = userState.getUsers().stream().map(User::getStatus).collect(Collectors.toList());
        Assert.assertFalse(NullOrEmptyCheck(emails));
        Assert.assertFalse(NullOrEmptyCheck(names));
        Assert.assertFalse(NullOrEmptyCheck(genders));
        Assert.assertFalse(NullOrEmptyCheck(statuses));
        System.out.println("I should do some validation");
    }

    private boolean NullOrEmptyCheck(List<String> t){
        return (t.contains(null) || t.contains(""));
    }
}


