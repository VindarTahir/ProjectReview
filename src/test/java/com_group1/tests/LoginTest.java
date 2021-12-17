package com_group1.tests;

import com_group1.TestBase;
import com_group1.pages.LibraryHomePage;
import com_group1.pages.LibraryLoginPage;
import com_group1.utils.ConfigurationReader;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void loginTest(){
        driver.get(ConfigurationReader.getProperty("library.url"));
        LibraryLoginPage loginPage = new LibraryLoginPage();
        loginPage.libraryLogin();
    }

    @Test
    public void homePageTest() throws InterruptedException {
        driver.get(ConfigurationReader.getProperty("library.url"));

        LibraryLoginPage loginPage = new LibraryLoginPage();
        loginPage.libraryLogin();

        LibraryHomePage homePage = new LibraryHomePage();
        Thread.sleep(2000);
        System.out.println(homePage.getInfo("Users"));

        homePage.books.click();
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(homePage.dashboard));
        homePage.dashboard.click();
    }

}
