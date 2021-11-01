package Ruuner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/main/resources/Annotation/outline.feature",
        glue = "StepsDefs",
//        dryRun = true,
        monochrome = true,
        plugin = {"pretty",
                "html: target/reports/fb_report.html"}

)
public class Facebook extends AbstractTestNGCucumberTests {

}
