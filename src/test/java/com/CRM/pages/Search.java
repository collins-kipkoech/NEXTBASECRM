package com.CRM.pages;

import com.CRM.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Search {
    @FindBy(xpath = "//input[@name='q']")
    public WebElement searchBtn;

    @FindBy(xpath = "//span[@class='search-title-top-item-text']/span")
    public WebElement outputText;

    public Search(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void searching(String word){

        searchBtn.sendKeys(word);
    }

    public void textOutput(){
        String finalText=this.outputText.getText();
        assertTrue(finalText.toLowerCase().contains("new york"));

    }




}
