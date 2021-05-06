import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {

        protected WebDriver driver;
        private  WebDriverWait wait;

        public PageObject(WebDriver driver){
            this.driver = driver;
            wait = new WebDriverWait(driver, 20);

            PageFactory.initElements(driver, this);

        }

        public void waitUntil(WebElement waiting){
            wait.until(ExpectedConditions.visibilityOf(waiting));
        }




}
