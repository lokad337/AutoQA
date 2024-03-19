package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UserProfilePage {

    private final SelenideElement userEmail = $(By.xpath("//input[@id='Email']"));

    public String getUserName () {
        String text = userEmail.getValue();
        return text;
    }

}

