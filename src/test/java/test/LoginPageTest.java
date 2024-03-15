package test;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class LoginPageTest extends BaseTest {


    @Test
    @DisplayName("Проверка входа с верными данными")
    public void TestLoginPositive(){
        open("https://xn--80afcdbalict6afooklqi5o.xn--p1ai/identity/account/login");
        //создание экземпляра класса LoginPage, теперь все методы оттуда будут доступны
        new LoginPage().inputValidUserName();

    }
}
