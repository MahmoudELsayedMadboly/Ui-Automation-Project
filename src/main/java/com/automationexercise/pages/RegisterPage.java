package com.automationexercise.pages;

import com.framework.core.config.ConfigManager;
import com.framework.ui.base.BasePage;
import org.openqa.selenium.By;

public class RegisterPage extends BasePage{
	
	/**
	 * RegisterPage — covers two screens:
	 * 1. Signup screen     — enter name and email
	 * 2. Account info screen — fill all registration details
	 */
	
	
	
	
	// ── Wait time ──────────────────────────────────────────────────────────
	 
    private int time = ConfigManager.getInt("registration.time");
 
    // ── Signup screen locators ─────────────────────────────────────────────
 
    private By newUserSignupHeader = By.xpath("//h2[text()='New User Signup!']");
    
    private By nameField           = By.name("name");
    
    private By emailField          = By.xpath("//input[@data-qa='signup-email']");
    
    private By signupButton        = By.xpath("//button[@data-qa='signup-button']");
 
    // ── Account information screen locators ───────────────────────────────
 
    private By enterAccountInfoHeader = By.xpath("//b[text()='Enter Account Information']");
    
    private By titleMrRadioButton     = By.id("id_gender1");
    
    private By titleMrsRadioButton    = By.id("id_gender2");
    
    private By passwordField          = By.id("password");
    
    private By dayOfBirthDropdown     = By.id("days");
    
    private By monthOfBirthDropdown   = By.id("months");
    
    private By yearOfBirthDropdown    = By.id("years");
    
    private By newsletterCheckbox     = By.id("newsletter");
    
    private By specialOffersCheckbox  = By.id("optin");
    
    private By firstNameField         = By.id("first_name");
    
    private By lastNameField          = By.id("last_name");
    
    private By companyField           = By.id("company");
    
    private By address1Field          = By.id("address1");
    
    private By address2Field          = By.id("address2");
    
    private By countryDropdown        = By.id("country");
    
    private By stateField             = By.id("state");
    
    private By cityField              = By.id("city");
    
    private By zipCodeField           = By.id("zipcode");
    
    private By mobileNumberField      = By.id("mobile_number");
    
    private By createAccountButton    = By.xpath("//button[@data-qa='create-account']");
    
 
    // ── Account created screen locators ───────────────────────────────────
 
    private By accountCreatedHeader = By.xpath("//h2[@data-qa='account-created']");
    
    private By continueButton       = By.xpath("//a[@data-qa='continue-button']");
    
 
    // ── Account deleted screen locators ───────────────────────────────────
 
    private By accountDeletedHeader = By.xpath("//h2[@data-qa='account-deleted']");
 
    // ── Signup screen methods ──────────────────────────────────────────────
 
    public boolean isNewUserSignupVisible() {
    	
        return isDisplayed(newUserSignupHeader);
        
    }
 
    public void enterName(String name) {
    	
        type(nameField, time, name);
        
    }
 
    public void enterEmail(String email) {
    	
        type(emailField, time, email);
        
    }
 
    public void clickSignup() {
    	
        click(signupButton);
        
    }
 
    // ── Account information screen methods ────────────────────────────────
 
    public boolean isEnterAccountInfoVisible() {
    	
        return isDisplayed(enterAccountInfoHeader);
        
    }
 
    public void selectTitleMr() {
    	
        click(titleMrRadioButton);
        
    }
 
    public void selectTitleMrs() {
    	
        click(titleMrsRadioButton);
        
    }
 
    public void enterPassword(String password) {
    	
        type(passwordField, time, password);
        
    }
 
    public void selectDayOfBirth(String day) {
    	
        selectByValue(dayOfBirthDropdown, day);
        
    }
 
    public void selectMonthOfBirth(String month) {
    	
        selectByValue(monthOfBirthDropdown, month);
        
    }
 
    public void selectYearOfBirth(String year) {
    	
        selectByValue(yearOfBirthDropdown, year);
        
    }
 
    public void checkNewsletter() {
    	
        click(newsletterCheckbox);
        
    }
 
    public void checkSpecialOffers() {
    	
        click(specialOffersCheckbox);
        
    }
 
    public void enterFirstName(String firstName) {
    	
        type(firstNameField, time, firstName);
        
    }
 
    public void enterLastName(String lastName) {
    	
        type(lastNameField, time, lastName);
        
    }
 
    public void enterCompany(String company) {
    	
        type(companyField, time, company);
        
    }
 
    public void enterAddress1(String address) {
    	
        type(address1Field, time, address);
        
    }
 
    public void enterAddress2(String address) {
    	
        type(address2Field, time, address);
        
    }
 
    public void selectCountry(String country) {
    	
        selectByVisibleText(countryDropdown, country);
        
    }
 
    public void enterState(String state) {
    	
        type(stateField, time, state);
        
    }
 
    public void enterCity(String city) {
    	
        type(cityField, time, city);
        
    }
 
    public void enterZipCode(String zipCode) {
    	
        type(zipCodeField, time, zipCode);
        
    }
 
    public void enterMobileNumber(String mobileNumber) {
    	
        type(mobileNumberField, time, mobileNumber);
        
    }
 
    public void clickCreateAccount() {
    	
        click(createAccountButton);
        
    }
 
    // ── Account created screen methods ────────────────────────────────────
 
    public boolean isAccountCreatedVisible() {
    	
        return isDisplayed(accountCreatedHeader);
        
    }
 
    public void clickContinue() {
    	
        click(continueButton);
        
    }
 
    // ── Account deleted screen methods ────────────────────────────────────
 
    public boolean isAccountDeletedVisible() {
    	
        return isDisplayed(accountDeletedHeader);
        
    }

}
