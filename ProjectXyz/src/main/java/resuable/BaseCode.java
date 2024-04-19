package resuable;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseCode {
    public static WebDriver driver ;
    public static Properties pro;
    public static void lauchBrowser() throws IOException {
        File file = new File("src/main/resources/configurations/utility.properties");
        FileInputStream fis = new FileInputStream(file);
        pro = new Properties();
        pro.load(fis);
//
//        if(pro.getProperty("browser").equalsIgnoreCase("chrome")){
//            driver = new ChromeDriver();
//        }
//        else if (pro.getProperty("browser").equalsIgnoreCase("edge")){
//
//            driver = new EdgeDriver();
//        }
//        else if (pro.getProperty("browser").equalsIgnoreCase("safari")){
//            driver = new SafariDriver();
//        }
//        else{
//            throw new InvalidArgumentException("enter valid browser name");
//        }

        switch (pro.getProperty("browser").toLowerCase()) {
            case "edge" -> driver = new EdgeDriver();
            case "chrome" -> driver = new ChromeDriver();
            case "safari" -> driver = new SafariDriver();
            default -> throw new InvalidArgumentException("enter valid browser name");
        }

       // driver.get(pro.getProperty("url"));
        driver.navigate().to(pro.getProperty("url"));
        driver.manage().window().maximize();
    }
}
