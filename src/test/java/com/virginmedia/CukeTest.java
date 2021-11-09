package com.virginmedia;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

// Junit test runner annotation
@RunWith(Cucumber.class)

// Cucumber options 
@CucumberOptions(

        //features file locations
        features = ".",
        // reporting plugins Location
        // cucumber html report plugin
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html",
                // extent report plugin
                "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html",
                // json report plugin
                "json:target/RunCuke/cucumber.json"},
        // display the console output in a proper readable format
        monochrome = true,
        // Cucumber tags
        tags = "@Smoke"

)

public class CukeTest {
    // junit after class annotation
    @AfterClass
    public static void setUP() {
        String projectPath = System.getProperty("user.dir");
        String reportConfigPath = projectPath + "/src/test/java/resources/extent_Report/extent-config.xml";
        Reporter.loadXMLConfig(reportConfigPath);
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
        Reporter.setSystemInfo("Selenium", "3.141.59");
        Reporter.setSystemInfo("Maven", "3.5.9");
        Reporter.setSystemInfo("Java Version", "1.8.0_151");
        Reporter.setSystemInfo("Junit","4.11");
        Reporter.setSystemInfo("Cucumber","1.2.5");

    }

}
