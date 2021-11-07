package com.virginmedia.base_Page;


import com.virginmedia.property_Reader.Property_Reader;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;
//BasePage

public class Base_Page {


        public static WebDriver driver;
        String baseUrl = Property_Reader.getInstance().getProperty("baseUrl");
        String projectPath = System.getProperty("user.dir");
        private static final Logger log = LogManager.getLogger(Base_Page.class.getName());

        public Base_Page()
        {
            PageFactory.initElements(driver,this);
            PropertyConfigurator.configure(projectPath + "/src/test/java/resources/properties_File/log4j.properties");
        }

        public void selectBrowser(String browser) {
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/chromedriver.exe");
                log.info("Launching Chrome Browser....");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", projectPath + "/Drivers/geckodriver.exe");
                log.info("Launching FireFox Browser....");
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("ie")) {
                System.setProperty("webdriver.ie.driver", projectPath + "/Drivers/IEDriverServer.exe");
                log.info("Launching IE Browser....");
                driver = new InternetExplorerDriver();
            } else {
                System.out.println("Wrong browser name");
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(Integer.parseInt(Property_Reader.getInstance().getProperty("implicitlyWait")), TimeUnit.SECONDS);
            driver.get(baseUrl);
        }
// quit the browser
        public void closeBrowser(){
            if (driver != null){
                driver.quit();
            }
        }

    }

