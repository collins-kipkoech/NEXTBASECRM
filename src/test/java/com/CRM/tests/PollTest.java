package com.CRM.tests;

import com.CRM.pages.Login;
import com.CRM.pages.Poll;
import com.CRM.utility.BrowserUtil;
import com.CRM.utility.ConfigReader;
import com.CRM.utility.Driver;
import com.CRM.utility.TestBase;
import org.junit.jupiter.api.Test;

public class PollTest extends TestBase {
    Login login;
    Poll poll;

    @Test
    public void testPoll(){
        login = new Login();
        login.goTo();
        String username = ConfigReader.read("username");
        String password = ConfigReader.read("password");
        login.login(username,password);
        BrowserUtil.waitFor(2);


        poll.pollBtn.click();
        BrowserUtil.waitFor(3);
    }
}
