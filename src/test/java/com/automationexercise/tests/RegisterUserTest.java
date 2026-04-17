package com.automationexercise.tests;

import com.framework.ui.base.BaseTest;
import com.framework.core.config.ConfigManager;
import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class RegisterUserTest extends BaseTest{
	
	
	
	// ── TC1: Register User ─────────────────────────────────────────────────
	 
    @Test(groups = {"smoke", "regression"})
    public void registerUser() {
 
        // Step 1 — initialize page objects
        HomePage homePage = new HomePage();
 
        RegisterPage registerPage = new RegisterPage();
 
        // Step 2 — verify home page is visible
        Assert.assertTrue(homePage.isHomePageVisible(),
                "Home page is not visible");
 
        // Step 3 — navigate to signup/login page
        homePage.clickSignUpLogin();
 
        // Step 4 — verify new user signup is visible
        Assert.assertTrue(registerPage.isNewUserSignupVisible(),
                "New User Signup header is not visible");
 
        // Step 5 — enter name and email
        registerPage.enterName(ConfigManager.getString("account.username"));
 
        registerPage.enterEmail(ConfigManager.getString("account.email"));
 
        // Step 6 — click signup button
        registerPage.clickSignup();
 
        // Step 7 — verify enter account information is visible
        Assert.assertTrue(registerPage.isEnterAccountInfoVisible(),
                "Enter Account Information header is not visible");
 
        // Step 8 — fill account details
        registerPage.selectTitleMr();
 
        registerPage.enterPassword(ConfigManager.getString("account.password"));
 
        registerPage.selectDayOfBirth(ConfigManager.getString("account.day"));
 
        registerPage.selectMonthOfBirth(ConfigManager.getString("account.month"));
 
        registerPage.selectYearOfBirth(ConfigManager.getString("account.year"));
 
        // Step 9 — select checkboxes
        registerPage.checkNewsletter();
 
        registerPage.checkSpecialOffers();
 
        // Step 10 — fill address details
        registerPage.enterFirstName(ConfigManager.getString("account.firstname"));
 
        registerPage.enterLastName(ConfigManager.getString("account.lastname"));
 
        registerPage.enterCompany(ConfigManager.getString("account.company"));
 
        registerPage.enterAddress1(ConfigManager.getString("account.address1"));
 
        registerPage.enterAddress2(ConfigManager.getString("account.address2"));
 
        registerPage.selectCountry(ConfigManager.getString("account.country"));
 
        registerPage.enterState(ConfigManager.getString("account.state"));
 
        registerPage.enterCity(ConfigManager.getString("account.city"));
 
        registerPage.enterZipCode(ConfigManager.getString("account.zipcode"));
 
        registerPage.enterMobileNumber(ConfigManager.getString("account.mobile"));
 
        // Step 11 — click create account
        registerPage.clickCreateAccount();
 
        // Step 12 — verify account created
        Assert.assertTrue(registerPage.isAccountCreatedVisible(),
                "Account Created header is not visible");
 
        // Step 13 — click continue
        registerPage.clickContinue();
 
        // Step 14 — verify logged in as username
        Assert.assertTrue(homePage.isLoggedInAsVisible(),
                "Logged in as username is not visible");
 
        // Step 15 — delete account
        homePage.clickDeleteAccount();
 
        // Step 16 — verify account deleted
        Assert.assertTrue(registerPage.isAccountDeletedVisible(),
                "Account Deleted header is not visible");
 
    }
	
	

}
