package com_group1.pages;

import com_group1.utils.ConfigurationReader;
import com_group1.utils.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    WebElement username;


    @FindBy(id = "inputPassword")
    WebElement password;

    public void libraryLogin(){
        username.sendKeys(ConfigurationReader.getProperty("username"));
        password.sendKeys(ConfigurationReader.getProperty("password") + Keys.ENTER);
    }

}
