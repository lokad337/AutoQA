package test;

import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;
import pages.UserProfilePage;

import static com.codeborne.selenide.Selenide.open;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    UserProfilePage userProfilePage = new UserProfilePage();

    private String expectedResult, actualResult;

    @Test
    public void loginValid() {
        loginPage.inputEmail();
        loginPage.inputPassword();
        loginPage.pressLoginButton();
        expectedResult = loginPage.emailValid;
        actualResult = userProfilePage.getUserName();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void loginNotValid() {
        loginPage.inputEmailNotValid();
        loginPage.inputPasswordNotValid();
        loginPage.pressLoginButton();
        expectedResult = loginPage.textDanger;
        actualResult = loginPage.getDangerText();
        Assert.assertEquals(expectedResult, actualResult);

    }




}
