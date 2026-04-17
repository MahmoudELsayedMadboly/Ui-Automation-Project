package com.automationexercise.pages;

import org.openqa.selenium.By;

import com.framework.ui.base.BasePage;

public class HomePage extends BasePage{
	
	
	/**
	 * HomePage — represents the main landing page of automationexercise.com
	 * Contains locators and actions for the home page only.
	 */
	
	
	// ── Locators ───────────────────────────────────────────────────────────
	 
    private By homePageHeader      = By.xpath("//h2[text()='Full-Fledged practice website for Automation Engineers']");
    
    private By signUpLoginButton   = By.linkText("Signup / Login");
    
    private By loggedInAsUsername  = By.xpath("//a[contains(text(),'Logged in as')]");
    
    private By deleteAccountButton = By.linkText("Delete Account");
    
    private By logoutButton        = By.linkText("Logout");
    
    private By productsButton      = By.linkText("Products");
    
    private By cartButton          = By.linkText("Cart");
    
    private By contactUsButton     = By.linkText("Contact us");
    
    private By testCasesButton     = By.linkText("Test Cases");
    
 
    // ── Verification methods ───────────────────────────────────────────────
 
    public boolean isHomePageVisible() {
    	
        return isDisplayed(homePageHeader);
        
    }
 
    public boolean isLoggedInAsVisible() {
    	
        return isDisplayed(loggedInAsUsername);
        
    }
 
    public String getLoggedInUsername() {
    	
        return getText(loggedInAsUsername);
        
    }
 
    // ── Action methods ─────────────────────────────────────────────────────
 
    public void clickSignUpLogin() {
    	
        click(signUpLoginButton);
        
    }
 
    public void clickDeleteAccount() {
    	
        click(deleteAccountButton);
        
    }
 
    public void clickLogout() {
    	
        click(logoutButton);
        
    }
 
    public void clickProducts() {
    	
        click(productsButton);
        
    }
 
    public void clickCart() {
    	
        click(cartButton);
        
    }
 
    public void clickContactUs() {
    	
        click(contactUsButton);
        
    }
 
    public void clickTestCases() {
    	
        click(testCasesButton);
        
    }
	
	

}
