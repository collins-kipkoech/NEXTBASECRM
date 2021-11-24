package com.CRM.pages;

import com.CRM.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
    @FindBy(xpath = "//input[@name='q']")
    public WebElement searchBtn;

    public Search(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void searching(String word){
        searchBtn.sendKeys(word);
    }



}
