package com.CRM.pages;

import com.CRM.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Poll {
    @FindBy(xpath = "(//span[.='Poll'])[1]")
    public WebElement pollBtn;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement pollFrame;

    @FindBy(tagName = "body")
    public WebElement textArea;

    @FindBy(id = "blog-submit-button-save")
    public WebElement submitBtn;

    public Poll(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


}
