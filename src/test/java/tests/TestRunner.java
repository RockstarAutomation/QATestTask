package tests;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.search.SearchMainPageAsGuest;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public abstract class TestRunner {
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getName());
    WebDriver driver;
    private final String TIME_TEMPLATE = "yyyy-MM-dd_HH-mm-ss";
    private final String SERVER_URL = "https://www.google.com";

    @BeforeClass
    public void beforeClass() {
        log.info("Test suite start");
        System.setProperty("webdriver.chrome.driver",
                "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("lang=en-US");
        driver = new ChromeDriver(options);
        log.info("ChromeDriver loaded");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        if (driver != null) {
            driver.quit();
        }
        log.info("ChromeDriver quite");
    }

    @AfterMethod
    public void afterMethod(ITestResult testResult) {
        if (!testResult.isSuccess()) {
            log.error("Test failed");
            try {
                String name = takeScreenShot();
                takePageSource(name);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        driver.manage().deleteAllCookies();
    }

    @Step
    public SearchMainPageAsGuest loadBrowser() {
        driver.get(SERVER_URL);
        log.debug("go to chrome page start");
        return new SearchMainPageAsGuest(driver);
    }

    @Attachment
    private String takeScreenShot() throws IOException {
        String currentTime = new SimpleDateFormat(TIME_TEMPLATE).format(new Date());
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./img/" + currentTime + "_screenshot.png"));
        log.info("Screenshot was taken");
        Path content = Paths.get("./img/" + currentTime + "_screenshot.png");
        try {
            InputStream is = Files.newInputStream(content);
            Allure.addAttachment("Screenshot", is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "./img/" + currentTime + "_screenshot";
    }

    private void takePageSource(String fileName) {
        String pageSource = driver.getPageSource();
        Path path = Paths.get(fileName + ".txt");
        byte[] strToBytes = pageSource.getBytes();
        try {
            Files.write(path, strToBytes, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
