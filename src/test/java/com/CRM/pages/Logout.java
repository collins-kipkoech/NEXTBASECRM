package com.CRM.pages;

import com.CRM.utility.Driver;
import com.CRM.utility.ConfigReader;
import com.CRM.utility.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Logout {

    @FindBy(xpath = "//input[@name='q']")
    public WebElement inputBox;

    @FindBy(xpath = "//span[@class='user-name']")
    public WebElement userMenu;

    @FindBy(linkText = "Log out")
    public WebElement logoutBtn;

    public Logout(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    public void logout(){
        userMenu.click();

        logoutBtn.click();
    }

    public boolean inputBoxDisplayed(){
        return inputBox.isDisplayed();

    }
}
