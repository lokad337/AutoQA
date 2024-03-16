package test;

// Базовый класс который будет относится ко всем классам

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @Before
    public void setUp() {
        open("https://xn--80afcdbalict6afooklqi5o.xn--p1ai/identity/account/login");
    }


}
