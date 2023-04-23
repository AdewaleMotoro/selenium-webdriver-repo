import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowerTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\MyMavenProject\\.idea\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://cwiki.apache.org/confluence/display/MAVEN/NoGoalSpecifiedException");
        driver.close();
        driver.quit();

        int myNum = 12;
        String website = "Nairaland";
        char letter = 'r';
        double moto = 5.99;
        boolean Nife = true;

        System.out.println(myNum + "The day i met oluwanifemi in church");
        //Array//
        //To store multiple values//
        //    int [] arr = new int[5];
        int arr[] = {2, 3, 4, 5, 6, 7};

        //For Loop//

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        String[] name = {"Ade","Kola","Tobi","Nife"};
        for( int i = 0; i < name.length; i++){

            System.out.println(name[i]);
        }
        //Store conditional value in for loop
        for( String s: name){
            System.out.println(s);
        }
    }
}