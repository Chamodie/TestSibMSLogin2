import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;




        public class LoginPage extends PageObject{

            private final String Username = "ChamodieP";
            private final String Password = "Cha@7788";
            private final String Location = "Colombo";



            @FindBy(xpath= "//input[@formcontrolname = 'userName']")
            private WebElement username;

            @FindBy(xpath = "//input[@formcontrolname ='password']")
            private WebElement password;

            @FindBy(xpath = "//div[@class='mat-select-arrow']")
            private WebElement locationarrow;

            @FindBy(xpath = "(//span[@class='location-dropdown-sub']/..)[1]")
            private WebElement location;

            @FindBy(xpath = "//button[@class='btn-login mat-raised-button']")
            private WebElement loginbutton;

            public LoginPage(WebDriver driver) {
                super(driver);
            }

            public void enterUsername(){
                waitUntil(username);
                username.sendKeys(Username);
            }

            public void enterPassword(){
                waitUntil(password);

                password.sendKeys(Password);
            }

            public void locationArrow(){
                waitUntil(locationarrow);
                this.locationarrow.click();

            }

            public void enterLocation(){
                waitUntil(location);
                this.location.click();



            }

            public void pressLoginButton(){

                waitUntil(loginbutton);
                loginbutton.click();
            }
        }



