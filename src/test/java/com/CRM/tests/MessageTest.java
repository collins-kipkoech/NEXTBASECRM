package com.CRM.tests;

import com.CRM.pages.Login;
import com.CRM.pages.Message;
import com.CRM.utility.BrowserUtil;
import com.CRM.utility.ConfigReader;
import com.CRM.utility.Driver;
import com.CRM.utility.TestBase;
import org.junit.jupiter.api.Test;

public class MessageTest extends TestBase {
    Message message;
    Login login;

    @Test
    public void testMessageSend(){
        message = new Message();
        login = new Login();
        login.goTo();
        String username = ConfigReader.read("username");
        String password = ConfigReader.read("password");
        login.login(username,password);

        message.messageBtn.click();
        BrowserUtil.waitFor(3);

        Driver.getDriver().switchTo().frame(message.iframeBtn);

        





    }
}
