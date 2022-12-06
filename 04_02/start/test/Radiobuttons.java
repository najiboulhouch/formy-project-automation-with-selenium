import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");
        WebElement radioBtnOne = driver.findElement(By.id("radio-button-1"));
        radioBtnOne.click();

        WebElement radioBtnTwo = driver.findElement(By.cssSelector("input[value='option2']"));
        radioBtnTwo.click();

        WebElement radioBtnThree = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioBtnThree.click();

        driver.quit();
    }
}
