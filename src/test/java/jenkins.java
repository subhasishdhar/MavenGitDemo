import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class jenkins {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.edge.driver", "C:\\Users\\03166A744\\Desktop\\msedgedriver.exe");
        driver = new EdgeDriver();
        String URL = "https://www.google.com";
        driver.get(URL);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void teardown(){
        driver.close();
    }

    @Test
    public void Test1(){
        System.out.println("Test1");
    }

    @Test
    public void Test2(){
        System.out.println("Test2");
    }

}
