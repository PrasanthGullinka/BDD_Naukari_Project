package com.naukari.stepDefination;

import Utility_Common.BaseClass;
import com.naukari.POM.LoginPage;
import com.naukari.POM.ProfilePage;
import com.naukari.POM.ResumeUpdatePage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class LoginStep extends BaseClass {

    private LoginPage login;
    private ProfilePage profile;
    private ResumeUpdatePage resume;

    @Given("User navigates to the login page")
    public void userNavigatesToLoginPage() {
        login = new LoginPage(driver);
        Assert.assertTrue(login.isHomePageVisible(), "Login page did not appear.");
        System.out.println("Driver status: " + driver);
    }

    @When("User clicks on the login button on the homepage")
    public void userClicksLoginButtonOnHomepage() {
        login.clickHomeLoginButton();
    }

    @And("User enters the username and password")
    public void userEntersUsernameAndPassword() {
        login.EnterUsername_Password();
    }

    @And("User clicks on the Login button")
    public void userClicksLoginButton() {
        login.ClickLoginbtnwithWait();
    }

    @Then("User should be logged in successfully")
    public void userShouldBeLoggedInSuccessfully() {
        profile = new ProfilePage(driver);
        Assert.assertTrue(profile.isProfilePageVisible(), "Profile page did not appear after login.");
    }

    @And("User clicks on the User Profile button")
    public void userClicksOnUserProfileButton() {
        profile.ClickViewProfile();
    }

    @And("User should land on the resume page")
    public void userShouldLandOnResumePage() {
        resume = new ResumeUpdatePage(driver);
        Assert.assertTrue(resume.isResumeUpdateTextVisible(), "Resume update page did not appear.");
    }

    @And("User clicks on the update resume button and upload resume")
    public void uploadResume() {
        resume.uploadResume("Prasanth_Resume.pdf");
    }

    @Then("User should see resume updated with today’s date")
    public void userShouldSeeResumeUpdatedWithTodaysDate() {
        String actualData = resume.ResumeDetails();
        Assert.assertEquals(actualData, "Profile last updated - Today", "Resume not uploaded successfully!");
    }

    @And("User clicks on More options")
    public void userClicksMoreOptions() {
        resume.ClickmoreOption();
    }

    @And("User clicks on Logout button")
    public void userClicksLogoutButton() {
        resume.ClickLogout();
    }

    @Then("User should be logged out successfully")
    public void userShouldBeLoggedOutSuccessfully() {
        userNavigatesToLoginPage(); // Reuse the existing login check
    }
}