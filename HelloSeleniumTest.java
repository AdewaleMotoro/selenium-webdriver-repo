import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSeleniumTest {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\MyMavenProject\\.idea\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.nairaland.com/");

    }


}
