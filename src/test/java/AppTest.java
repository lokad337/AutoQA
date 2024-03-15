
import org.junit.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void TestLoginPositive(){
        open("https://xn--80afcdbalict6afooklqi5o.xn--p1ai/identity/account/login");

        //создание экземпляра класса LoginPage, теперь все методы оттуда будут доступны
        new LoginPage().inputValidUserName();

    }
}
