package pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleMainPagesComponentsLogged extends pages.common.GoogleMainPagesComponents {
    private WebElement newsMainPagesComponents;
    private WebElement classMainPagesComponent;
    private WebElement myProfileLinkButton;

    protected GoogleMainPagesComponentsLogged(WebDriver driver) {
        super(driver);
        initElements();
    }

    private void initElements() {
        myProfileLinkButton = driver.findElement(By.cssSelector("div[class=\"gb_Kf gb_La gb_Ag gb_i\"] a"));
        newsMainPagesComponents = driver.findElement(By.xpath("//a[@class='tX9u1b']/span[contains(text(),'News')]"));
        classMainPagesComponent = driver.findElement(By.xpath("//a[@class='tX9u1b']/span[contains(text(),'Class')]"));
    }

    //Functionality
    private void clickNewsMainPagesComponents() {
        newsMainPagesComponents.click();
    }

    public void clickMyProfileLinkButton() {
        myProfileLinkButton.click();
    }


    private void clickClassMainPagesComponent() {
        classMainPagesComponent.click();
    }

    //BusinessLogic
    protected void gotoNewsPage() {
        clickDropDownAllMainPages();
        clickNewsMainPagesComponents();
    }

    protected void gotoClassPage() {
        clickDropDownAllMainPages();
        clickMoreDropDownMainPagesComponent();
        clickClassMainPagesComponent();
    }
}
