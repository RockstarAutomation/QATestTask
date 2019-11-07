package pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class GoogleMainPagesComponents extends GoogleMainPagesContainer {


    protected GoogleMainPagesComponents(WebDriver driver) {
        super(driver);
    }


    //Page object
    private WebElement getAnotherGoogleServicesMainPagesComponent() {

        return driver.findElement(By.cssSelector("a[class=\"NQV3m\"]"));
    }

    private WebElement getMyAccountMainPagesComponent() {
        return driver.findElement(By.xpath("//a[@class='tX9u1b']/span[contains(text(),'Account')]"));
    }

    private WebElement getSearchMainPagesComponent() {
        return driver.findElement(By.xpath("//a[@class='tX9u1b']/span[contains(text(),'Search')]"));
    }

    private WebElement getMapsMainPagesComponent() {
        return driver.findElement(By.xpath("//a[@class='tX9u1b']/span[contains(text(),'Maps')]"));
    }

    private WebElement getYouTubeMainPagesComponent() {
        return driver.findElement(By.xpath("//a[@class='tX9u1b']/span[contains(text(),'YouTube')]"));
    }

    private WebElement getPlayMainPagesComponent() {
        return driver.findElement(By.xpath("//a[@class='tX9u1b']/span[contains(text(),'Play')]"));
    }

    private WebElement getPostOfficeMainPagesComponent() {
        return driver.findElement(By.xpath("//a[@class='tX9u1b']/span[contains(text(),'Gmail')]"));
    }

    private WebElement getContactsMainPagesComponent() {
        return driver.findElement(By.xpath("//a[@class='tX9u1b']/span[contains(text(),'Contacts')]"));
    }

    private WebElement getTranslateMainPagesComponent() {
        return driver.findElement(By.xpath("//a[@class='tX9u1b']/span[contains(text(),'Translate')]"));
    }

    private WebElement getCloudMainPagesComponent() {
        return driver.findElement(By.xpath("//a[@class='tX9u1b']/span[contains(text(),'Drive')]"));
    }

    private WebElement getCalendarMainPagesComponent() {
        return driver.findElement(By.xpath("//a[@class='tX9u1b']/span[contains(text(),'Calendar')]"));
    }

    private WebElement getPhotoMainPagesComponent() {
        return driver.findElement(By.xpath("//a[@class='tX9u1b']/span[contains(text(),'Photos')]"));
    }

    private WebElement getMoreDropDownMainPagesComponent() {
        return driver.findElement(By.xpath("//a[@class='K1u0Zb']"));
    }

    private WebElement getDocumentsMainPagesComponent() {
        return driver.findElement(By.xpath("//a[@class='tX9u1b']/span[contains(text(),'Docs')]"));
    }

    private WebElement getBloggerMainPagesComponent() {
        return driver.findElement(By.xpath("//a[@class='tX9u1b']/span[contains(text(),'Blogger')]"));
    }

    private WebElement getDuoMainPagesComponent() {
        return driver.findElement(By.xpath("//a[@class='tX9u1b']/span[contains(text(),'Duo')]"));
    }

    private WebElement getHangoutsMainPagesComponent() {
        return driver.findElement(By.xpath("//a[@class='tX9u1b']/span[contains(text(),'Hangouts')]"));
    }

    private WebElement getGoogleKeepMainPagesComponent() {
        return driver.findElement(By.xpath("//a[@class='tX9u1b']/span[contains(text(),'Keep')]"));
    }

    private WebElement getJamboardMainPagesComponent() {
        return driver.findElement(By.xpath("//a[@class='tX9u1b']/span[contains(text(),'Jamboard')]"));
    }

    private WebElement getEarthMainPagesComponent() {
        return driver.findElement(By.xpath("//a[@class='tX9u1b']/span[contains(text(),'Earth')]"));
    }

    private WebElement getCollectionsMainPagesComponent() {
        return driver.findElement(By.xpath("//a[@class='tX9u1b']/span[contains(text(),'Collections')]"));
    }


    //Functionality
    protected void clickMyAccountMainPagesComponent() {
        getMyAccountMainPagesComponent().click();
    }

    protected void clickSearchMainPagesComponent() {
        getSearchMainPagesComponent().click();
    }

    protected void clickMapsMainPagesComponent() {
        getMapsMainPagesComponent().click();
    }

    protected void clickYouTubeMainPagesComponent() {
        getYouTubeMainPagesComponent().click();
    }

    protected void clickPlayMainPagesComponent() {
        getPlayMainPagesComponent().click();
    }

    protected void clickPostOfficeMainPagesComponent() {
        getPostOfficeMainPagesComponent().click();
    }

    protected void clickContactsMainPagesComponent() {
        getContactsMainPagesComponent().click();
    }

    protected void clickTranslateMainPagesComponent() {
        getTranslateMainPagesComponent().click();
    }

    protected void clickCloudMainPagesComponent() {
        getCloudMainPagesComponent().click();
    }

    protected void clickCalendarMainPagesComponent() {
        getCalendarMainPagesComponent().click();
    }

    protected void clickPhotoMainPagesComponent() {
        getPhotoMainPagesComponent().click();
    }

    protected void clickMoreDropDownMainPagesComponent() {
        getMoreDropDownMainPagesComponent().click();
    }

    protected void clickDocumentsMainPagesComponent() {
        getDocumentsMainPagesComponent().click();
    }

    protected void clickBloggerMainPagesComponent() {
        getBloggerMainPagesComponent().click();
    }

    protected void clickDuoMainPagesComponent() {
        getDuoMainPagesComponent().click();
    }

    protected void clickHangoutsMainPagesComponent() {
        getHangoutsMainPagesComponent().click();
    }

    protected void clickGoogleKeepMainPagesComponent() {
        getGoogleKeepMainPagesComponent().click();
    }

    protected void clickJamboardMainPagesComponent() {
        getJamboardMainPagesComponent().click();
    }

    protected void clickEarthMainPagesComponent() {
        getEarthMainPagesComponent().click();
    }

    protected void clickCollectionsMainPagesComponent() {
        getCollectionsMainPagesComponent().click();
    }

    protected void clickAnotherGoogleServicesMainPagesComponent() {
        (new WebDriverWait(driver, 6)
                .until(ExpectedConditions
                        .refreshed(ExpectedConditions
                                .elementToBeClickable(getAnotherGoogleServicesMainPagesComponent()))))
                .click();

    }

    // Business Logic

    public void gotoMyAccountPage() {
        clickDropDownAllMainPages();
        clickMyAccountMainPagesComponent();
    }

    public void gotoSearchPage() {
        clickDropDownAllMainPages();
        clickSearchMainPagesComponent();
    }

    public void gotoMapsPage() {
        clickDropDownAllMainPages();
        clickMapsMainPagesComponent();
    }

    public void gotoYouTubePage() {
        clickDropDownAllMainPages();
        clickYouTubeMainPagesComponent();
    }

    public void gotoPlayPage() {
        clickDropDownAllMainPages();
        clickPlayMainPagesComponent();
    }

    public void gotoPostOfficePage() {
        clickDropDownAllMainPages();
        clickPostOfficeMainPagesComponent();
    }

    public void gotoContactsPage() {
        clickDropDownAllMainPages();
        clickContactsMainPagesComponent();
    }

    public void gotoTranslatePage() {
        clickDropDownAllMainPages();
        clickTranslateMainPagesComponent();
    }

    public void gotoCloudPage() {
        clickDropDownAllMainPages();
        clickCloudMainPagesComponent();
    }

    public void gotoPageCalendar() {
        clickDropDownAllMainPages();
        clickCalendarMainPagesComponent();
    }

    public void gotoPagePhoto() {
        clickDropDownAllMainPages();
        clickPhotoMainPagesComponent();
    }

    public void gotoDocumentsPage() {
        clickMoreDropDownMainPagesComponent();
        clickDocumentsMainPagesComponent();
    }

    public void gotoDuoPage() {
        clickMoreDropDownMainPagesComponent();
        clickDuoMainPagesComponent();
    }

    public void gotoHangoutsPage() {
        clickMoreDropDownMainPagesComponent();
        clickHangoutsMainPagesComponent();
    }

    public void gotoBloggerPage() {
        clickMoreDropDownMainPagesComponent();
        clickBloggerMainPagesComponent();
    }

    public void gotoKeepPage() {
        clickMoreDropDownMainPagesComponent();
        clickGoogleKeepMainPagesComponent();
    }

    public void gotoJamboardPage() {
        clickMoreDropDownMainPagesComponent();
        clickJamboardMainPagesComponent();
    }

    public void gotoEarthPage() {
        clickMoreDropDownMainPagesComponent();
        clickEarthMainPagesComponent();
    }

    public void gotoAnotherGoogleServicesPage() {
        clickMoreDropDownMainPagesComponent();
        clickAnotherGoogleServicesMainPagesComponent();
    }

}
