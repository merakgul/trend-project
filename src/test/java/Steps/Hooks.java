package Steps;


import Base.BaseStep;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Hooks extends BaseStep {


    @Before("@chrome")
    public void GoogleChrome() {
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
    }


    @Before("@ie")
    public void InternetExplorer() {
        System.setProperty("webdriver.ie.driver", "driver\\IEDriverServer.exe");
    }


    @Before("@firefox")
    public void MozillaFirefox() {
        System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
    }

    @Before("@edge")
    public void MSEdge() {
        System.setProperty("webdriver.edge.driver", "\\driver\\msedgedriver.exe");
    }


    @Before("@opera")
    public void Opera() {
        System.setProperty("webdriver.opera.driver", "\\driver\\operadriver.exe");
    }


    @Test()
    public void VerifyHomeTitle() {
        String expectedTitle = "En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }


    @After("@chrome")
    public void DriverClose(){
        driver.quit();
    }

}
