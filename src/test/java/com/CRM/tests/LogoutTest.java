package com.CRM.tests;

import com.CRM.pages.Login;
import com.CRM.pages.Logout;
import com.CRM.utility.ConfigReader;
import com.CRM.utility.TestBase;
import org.junit.jupiter.api.Test;

public class LogoutTest extends TestBase {
    Logout logout;
    Login login;

    @Test
    public void testLogout(){
        logout = new Logout();
        login = new Login();
        login.goTo();
        String username = ConfigReader.read("username");
        String password = ConfigReader.read("password");
        login.login(username,password);

        logout.logout();


    }
}
