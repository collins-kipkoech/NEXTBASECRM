package com.CRM.pages;

import com.CRM.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Message {
    @FindBy(xpath = "//span[@class='feed-add-post-micro-title']")
    public WebElement messageBtn;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframeBtn;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement submitBtn;

    public Message(){
        PageFactory.initElements(Driver.getDriver(),this);
    }






}
