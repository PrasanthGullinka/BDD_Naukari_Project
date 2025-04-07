package com.naukari.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    // WebElements
    @FindBy(xpath = "//div[@title='Prasanth Gullinka']")
    private WebElement profileTitle;

    @FindBy(xpath = "//div[normalize-space()='View profile']/a")
    private WebElement viewProfileButton;

    // Methods
    public boolean isProfilePageVisible() {
        return IsDisplayedElement(profileTitle);
    }

    public void ClickViewProfile() {
        viewProfileButton.click();
    }
}

//package com.naukari.POM;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//public class ProfilePage extends BasePage{
//	
//	public ProfilePage(WebDriver driver) {
//		super(driver);
//		
//	}
//	
//	@FindBy(xpath="//div[@title='Prasanth Gullinka']") WebElement ProfilePage;
//	
//	@FindBy(xpath="//div[normalize-space()='View profile']/a") WebElement ViewProfilebtn;
//
//	public boolean ProfilePageAppear() {
//		return IsDisplayedElement(ProfilePage);
//	
//	}
//	
//	public void ClickViewProfile() {
//		ViewProfilebtn.click();
//	}
//	
//	
//}
