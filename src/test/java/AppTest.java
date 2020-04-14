import org.junit.Assert;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest {
    private String siteURL ="https://qualityhouse.com/";
    private String projectLocation = System.getProperty("user.dir");
    private WebDriver driver;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.gecko.driver", projectLocation + "\\lib\\geckodriver\\geckodriver.exe");
        System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void loadPage(){
        driver.get(siteURL);
        Assert.assertEquals(driver.getTitle(), "Home | Quality House Ltd.");
        driver.quit();
    }
}
