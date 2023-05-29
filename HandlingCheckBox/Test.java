package HandlingCheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {


    public static void main(String[]args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\MyMavenProject\\target\\classes\\.idea\\chromedriver.exe"  );

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/uk/request-demo");
        driver.manage().window().maximize();
        driver.findElement(By.name("doi")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("doi")).click();




    }


}
