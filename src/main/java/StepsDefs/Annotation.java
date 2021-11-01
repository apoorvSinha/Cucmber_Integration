package StepsDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Annotation {
WebDriver driver;
    @Given("I am on Facebook page")
    public void i_am_on_facebook_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

    }

    @When("I enter username as {string}")
    public void i_enter_username_as(String string) {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(string);

    }

    @When("I enter password as {string}")
    public void i_enter_password_as(String string) throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(string);
        driver.findElement(By.xpath("//button[@name='login']")).click();
        Thread.sleep(3000);
    }

    @Then("login should fail")
    public void login_should_fail() {
        if(driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/?sk=welcome")){
            System.out.println("Test is failed");
        }
       else{
            System.out.printf("Test is passed");
        }

    }

    @Then("relogin option should be available")
    public void relogin_option_should_be_available() {
        if(driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/?sk=welcome")){
            System.out.println("Test is failed");
        }
        else{
            System.out.printf("Test is passed");
        }
    }


}
