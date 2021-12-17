package com_group1.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

    static WebDriverWait wait;

    public static void waitClick(WebElement element, int seconds){
        wait = new WebDriverWait(Driver.getDriver(), seconds);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }



}
