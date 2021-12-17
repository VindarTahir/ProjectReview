package com_group1.pages;

import com_group1.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Locale;

public class LibraryHomePage {

    public LibraryHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='#dashboard']")
    public WebElement dashboard;

    @FindBy(xpath = "//a[@href='#users']")
    public WebElement users;

    @FindBy(xpath = "//a[@href='#books']")
    public WebElement books;

    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement homePage;

    public String getInfo(String str){
        return Driver.getDriver().findElement(By.xpath("//h6[.='"+str+"']/..//h2")).getText();
//        return Driver.getDriver().findElement(By.xpath("//h2[@id='"+str+"_count']")).getText();
    }



}
