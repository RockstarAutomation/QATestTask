package pages.search;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.common.GoogleMainPagesComponentsGuest;
import repository.Search;
import repository.SearchRepository;

public class SearchMainPageAsGuest extends GoogleMainPagesComponentsGuest {

    private WebElement searchFieldMainPage;
    private WebElement searchByVoiceMainPage;
    private WebElement searchInGoogleMainPage;
    private WebElement willLuckMeMainPage;
    private WebElement advertisingMainPage;
    private WebElement forBusinessMainPage;
    private WebElement howGoogleSearchWorksMainPage;
    private WebElement settingsMainPage;

    public SearchMainPageAsGuest(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        searchFieldMainPage = driver.findElement(By.cssSelector("input[class=\"gLFyf gsfi\"]"));
        searchByVoiceMainPage = driver.findElement(By.cssSelector("div.JC0tCe"));
        searchInGoogleMainPage = driver.findElement(By.cssSelector("div[class=\"FPdoLc VlcLAe\"] center input.gNO89b"));
        willLuckMeMainPage = driver.findElement(By.cssSelector("div[class=\"FPdoLc VlcLAe\"] center input.RNmpXc"));
        advertisingMainPage = driver.findElement(By.xpath("//span[@id='fsl']/a[contains(text(),'Advertising')]"));
        forBusinessMainPage = driver.findElement(By.xpath("//span[@id='fsl']/a[contains(text(),'Business')]"));
        howGoogleSearchWorksMainPage = driver.findElement(By.xpath("//span[@id='fsl']/a[contains(text(),'How Search works')]"));
        settingsMainPage = driver.findElement(By.xpath("//span[@id='fsr']/span/a[contains(text(),'Settings')]"));
    }

    //Page Object
    private WebElement getWebLanguageMainPage(String language) {
        return driver.findElement(By.cssSelector("//div[@id='SIvCob']/a[contains(text(),'" + language + "')]"));
    }

    //Functionality
    public void clickLanguageMainPage(String language) {
        getWebLanguageMainPage(language).click();

    }

    public void clickSearchFieldMainPage() {
        searchFieldMainPage.click();
    }

    public void clearSearchFieldMainPage() {
        searchFieldMainPage.clear();
    }

    public void setSearchFieldMainPage(String lol) {
        searchFieldMainPage.sendKeys(lol);
    }

    public void clickSearchByVoiceMainPage() {
        searchByVoiceMainPage.click();
    }

    public void clickSearchInGoogleMainPage() {
        searchInGoogleMainPage.click();
    }

    public void clickWillLuckMeMainPage() {
        willLuckMeMainPage.click();
    }

    public void clickAdvertisingMainPage() {
        advertisingMainPage.click();
    }

    public void clickForBusinessMainPage() {
        forBusinessMainPage.click();
    }

    public void clickHowGoogleSearchWorksMainPage() {
        howGoogleSearchWorksMainPage.click();
    }

    public void clickSettingsMainPage() {
        settingsMainPage.click();
    }

    //Business logic
    @Step
    public void searchByKeyBoard(String obj){
        clickSearchFieldMainPage();
        clearSearchFieldMainPage();
        setSearchFieldMainPage(obj);
        clickSearchInGoogleMainPage();
    }
    @Step
    public void searchByVoice(){
        clickSearchByVoiceMainPage();
        clickSearchInGoogleMainPage();
    }
}
