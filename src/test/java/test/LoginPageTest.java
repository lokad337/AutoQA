package test;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import pages.LoginPage;
import static com.codeborne.selenide.Selenide.open;


public class LoginPageTest extends BaseTest {
    

    @Test
    @DisplayName("Проверка страницы логин")
    public void TestLoginPositive(){

        // создание экземпляра класса LoginPage, теперь все методы оттуда будут доступны
        new LoginPage().inputValidUserName();
    }


}
