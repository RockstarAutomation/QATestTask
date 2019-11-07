package pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class GoogleMainPagesContainer {

    protected WebDriver driver;

    private WebElement gmailLinkButton;
    private WebElement imagesLinkButton;
    private WebElement dropDownAllMainPages;
    private WebElement signInButton;
    private WebElement privacy;
    private WebElement terms;

    protected GoogleMainPagesContainer(WebDriver driver){
        this.driver = driver;
        initElements();
    }

    protected GoogleMainPagesContainer(WebDriver driver, Boolean bool){
        this.driver = driver;
        initElements();
    }
    private void initElements(){
        gmailLinkButton = driver.findElement(By.xpath("//div[@class='gb_h gb_i']/a[contains(text(),'Gmail')]"));
        imagesLinkButton = driver.findElement(By.xpath("//div[@class='gb_h gb_i']/a[contains(text(),'Images')]"));
        dropDownAllMainPages = driver.findElement(By.cssSelector("div[class=\"gb_C gb_gd gb_i\"] a"));
        privacy = driver.findElement(By.xpath("//span/a[contains(text(),'Privacy')]"));
        terms = driver.findElement(By.xpath("//span/a[contains(text(),'Terms')]"));
    }

    //Page object
    private WebElement getWebSignInButton(){
        return driver.findElement(By.cssSelector("div[class=\"gb_lg gb_i\"] a"));
    }

    //Functionality
    public void clickGmailLinkButton(){
        gmailLinkButton.click();
    }

    public void clickImagesLinkButton(){
        imagesLinkButton.click();
    }

    public void clickDropDownAllMainPages(){
        dropDownAllMainPages.click();
    }

    public void clickPrivacy(){
        privacy.click();
    }

    public void clickTerms(){
        terms.click();
    }
    public void clickSingInButton(){
        getWebSignInButton().click();
    }

    //Business logic
}
