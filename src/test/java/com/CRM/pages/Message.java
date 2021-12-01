package com.CRM.pages;

import com.CRM.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Message {
    @FindBy(xpath = "//span[@class='feed-add-post-micro-title']")
    public WebElement messageBtn;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframeBtn;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement submitBtn;

    @FindBy(tagName = "body")
    public WebElement textArea;

    @FindBy(xpath = "//div[@class='feed-post-text-block-inner-inner']")
    public List<WebElement> messageTexts;



    public Message(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void messages(){
        System.out.println(messageTexts.size());

        for (WebElement eachmessageText : messageTexts) {
            System.out.println(eachmessageText.getText());
            return;

        }
    }






}
