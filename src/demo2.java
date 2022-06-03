import graphql.VisibleForTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\14038\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

    }
}
