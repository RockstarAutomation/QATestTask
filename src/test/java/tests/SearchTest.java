package tests;

import io.qameta.allure.Story;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.search.SearchMainPageAsGuest;
import repository.SearchRepository;
import tools.Listener;

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
    public void searchByText(String language) {
        SearchMainPageAsGuest searchMainPageAsGuest = loadBrowser();
        searchMainPageAsGuest.searchByKeyBoard(language);
    }

    @DataProvider
    public Object[][] digitsProvider() {
        return new Object[][]{
                {SearchRepository.get().getDigits().getSearch()}
        };
    }

    @Story("Guest search some digits in google")
    @Test(dataProvider = "digitsProvider")
    public void searchByDigits(String language) {
        SearchMainPageAsGuest searchMainPageAsGuest = loadBrowser();
        searchMainPageAsGuest.searchByKeyBoard(language);
    }

    @DataProvider
    public Object[][] textProvider() {
        return new Object[][]{
                {SearchRepository.get().getHugeText().getSearch()}
        };
    }


    @Story("Guest search some huge text in google")
    @Test(dataProvider = "textProvider")
    public void searchByHugeText(String language) {
        SearchMainPageAsGuest searchMainPageAsGuest = loadBrowser();
        searchMainPageAsGuest.searchByKeyBoard(language);
    }
}
