package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement userNameInput = $(By.xpath("//input[@id='Username']"));
    private final SelenideElement passwordInput = $(By.xpath("//input[@id='Username']"));
    private final SelenideElement loginButton = $(By.xpath("//button[@id='loginBtn']"));

    public void checkVisibleLoginButton() {
        loginButton.shouldBe(visible);
    }

    public void inputValidUserName() {
        userNameInput.setValue("loktionov.alx@gmail.com");
    }

    public void inputValidPassword() {
        userNameInput.setValue("CGNdEew2xa!S-Ci");
    }


}
