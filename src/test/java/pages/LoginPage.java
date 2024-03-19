
package pages;


import com.codeborne.selenide.SelenideElement;
import javafx.scene.transform.ShearBuilder;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class LoginPage {

    private final SelenideElement emailField = $(By.xpath("//input[@id='Username']"));
    private final SelenideElement passwordField = $(By.xpath("//input[@id='Password']"));
    private final SelenideElement loginButton = $(By.xpath("//button[@id='loginBtn']"));
    private final SelenideElement dangerText = $(By.xpath("//span[@class='text-danger field-validation-error']"));
    private final SelenideElement header = $(By.xpath("//span[.='Вход']"));

    public final String textDanger = "Неверный логин или пароль";

    // Валидные данные
    public final String emailValid = "loktionov.alx@gmail.com";
    public final String passwordValid = "CGNdEew2xa!S-Ci";
    // Не валидные данные
    public final String emailNotValid = "loktionazcov.alx@gmail.com";
    public final String passwordNotValid = "CGNdEeascw2xa!S-Ci";

    public void inputEmail() {
        emailField.setValue(emailValid);
    }

    public void inputEmailNotValid() {
        emailField.setValue(emailNotValid);
    }

    public void inputPassword() {
        passwordField.setValue(passwordValid);
    }

    public void inputPasswordNotValid() {
        passwordField.setValue(passwordNotValid);
    }

    public void pressLoginButton() {
        loginButton.click();
    }

    public String getDangerText() {
      String text = dangerText.getText();
        return text;
    }

    public String getHeader() {
        String text = header.getText();
        return text;
    }

}
