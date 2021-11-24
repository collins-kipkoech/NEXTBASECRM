package com.CRM.pages;

import com.CRM.utility.ConfigReader;
import com.CRM.utility.Driver;
import com.CRM.utility.ConfigReader;
import com.CRM.utility.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Login {


    @FindBy(xpath = "//div[.='Authorization']")
    public WebElement headerElement;

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordBox;

    @FindBy(className = "login-btn")
    public  WebElement submitBtn;

    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement errorMsg;

    public Login(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    public void goTo(){
        Driver.getDriver().navigate().to( ConfigReader.read("url"));


    }

    public void login(String username, String password ){


        this.usernameBox.sendKeys(username);
        this.passwordBox.sendKeys(password);
        this.submitBtn.click();

    }


    public boolean loginErrorMsgPresent(){

        return  this.errorMsg.isDisplayed()  ;

    }











}
