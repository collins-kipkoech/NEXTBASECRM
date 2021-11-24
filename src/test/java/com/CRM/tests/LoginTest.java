package com.CRM.tests;

import com.CRM.pages.Login;
import com.CRM.utility.ConfigReader;
import com.CRM.utility.TestBase;
import org.junit.jupiter.api.Test;

public class LoginTest extends TestBase {
    Login login;

    @Test
    public void testLogin(){
        login = new Login();
        login.goTo();
        String username = ConfigReader.read("username");
        String password = ConfigReader.read("password");
        login.login(username,password);





    }
}
