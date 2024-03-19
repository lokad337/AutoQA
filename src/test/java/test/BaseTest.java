package test;

// Базовый класс который будет относится ко всем классам


import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;



public class BaseTest {

    @Before
    public void setUp() {
        Selenide.open("https://xn--80afcdbalict6afooklqi5o.xn--p1ai/identity/account/login");

    }

    @After
    public void close() {
        Selenide.clearBrowserCookies();
        //Selenide.closeWebDriver();
    }

}
