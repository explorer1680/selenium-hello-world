import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

public class PG1 {

    public static void main(String[] args) throws InterruptedException {
        // declaration and instantiation of objects/variables
//        System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
        //comment the above 2 lines and uncomment below 2 lines to use Chrome

        //traditional way to setup driver
//        System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");

        //using Maven to setup driver.
        WebDriverManager.getInstance(CHROME).setup();
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        //close browser
        Thread.sleep(5000);
        driver.close();

    }

}
