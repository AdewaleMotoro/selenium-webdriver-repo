import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*HTML LOCATORS
    */

public class JaveMethodtest {

    
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\MyMavenProject\\.idea\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("motoroadewale@gmail.com");
        driver.findElement(By.name("inputPassword")).sendKeys(("Human_1430"));
        driver.findElement(By.className("signInBtn")).click();
        driver.findElement(By.cssSelector())


//CSS Selector//
/*How to generate CSS selector
example: <input type="text" placeholder="Username" id="inputUsername" value="">
id==>tagname#id Answer= input.inputusername
       example:    <button class="submit signInBtn" type="submit">Sign In</button>
        classname=> tagname.classname Answer = button.signInBtn


        IF no ID OR CLASSNAME
        FORMULA
        Tagname[attribute='value']

Example:<input type="text" placeholder="Username"  value="">
Answer input[placeholder=Username]
 */



}
}
