package tests;

import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.search.SearchMainPageAsGuest;
import repository.SearchRepository;
import tools.Listener;

import static org.testng.Assert.assertEquals;

@Listeners(Listener.class)
public class SearchTest extends TestRunner {

    @DataProvider
    public Object[][] dataProvider() {
        return new Object[][]{
                {SearchRepository.get().getText().getSearch()}
        };
    }

    @Story("Guest search some text in google")
    @Test(dataProvider = "dataProvider")
    public void searchByText(String text) {
        SearchMainPageAsGuest searchMainPageAsGuest = loadBrowser();
        searchMainPageAsGuest.searchByKeyBoard(text);
        assertEquals(text, driver.findElement(By.cssSelector("input[class=\"gLFyf gsfi\"]")).getAttribute("value"),
                "The searching item has been changed");
    }

    @DataProvider
    public Object[][] digitsProvider() {
        return new Object[][]{
                {SearchRepository.get().getDigits().getSearch()}
        };
    }

    @Story("Guest search some digits in google")
    @Test(dataProvider = "digitsProvider")
    public void searchByDigits(String digits) {
        SearchMainPageAsGuest searchMainPageAsGuest = loadBrowser();
        searchMainPageAsGuest.searchByKeyBoard(digits);
        assertEquals(digits, driver.findElement(By.cssSelector("input[class=\"gLFyf gsfi\"]")).getAttribute("value"),
                "The searching item has been changed");
    }

    @DataProvider
    public Object[][] textProvider() {
        return new Object[][]{
                {SearchRepository.get().getHugeText().getSearch()}
        };
    }


    @Story("Guest search some huge text in google")
    @Test(dataProvider = "textProvider")
    public void searchByHugeText(String text) {
        SearchMainPageAsGuest searchMainPageAsGuest = loadBrowser();
        searchMainPageAsGuest.searchByKeyBoard(text);
        assertEquals(text, driver.findElement(By.cssSelector("input[class=\"gLFyf gsfi\"]")).getAttribute("value"),
                "The searching item has been changed");
    }
}
