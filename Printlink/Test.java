package Printlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Test {



    public static void main(String[]args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\MyMavenProject\\target\\classes\\.idea\\chromedriver.exe"  );

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/uk/request-demo/");
        driver.manage().window().maximize();

        List<WebElement> Mytags = driver.findElements(By.tagName("a"));
        System.out.println("Total tags are: "+Mytags.size());

        for(int i = 0;i<Mytags.size();i++)
        {
            System.out.println("Links on page are"+Mytags.get(i).getAttribute("href"));
            System.out.println("Links on page are"+Mytags.get(i).getText());
        }


    }
}
