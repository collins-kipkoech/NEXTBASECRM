package com.CRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Message {
    @FindBy(xpath = "//span[@class='feed-add-post-micro-title']")
    public WebElement messageBtn;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframeBtn;
}
