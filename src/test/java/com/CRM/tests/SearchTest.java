package com.CRM.tests;

import com.CRM.pages.Login;
import com.CRM.pages.Search;
import com.CRM.utility.BrowserUtil;
import com.CRM.utility.ConfigReader;
import com.CRM.utility.TestBase;
import org.junit.jupiter.api.Test;

public class SearchTest extends TestBase {
    Search search;
    Login login;

    @Test
    public void testSearch(){
        login = new Login();
        login.goTo();
        String username = ConfigReader.read("username");
        String password = ConfigReader.read("password");
        login.login(username,password);
        BrowserUtil.waitFor(2);
        search = new Search();
        search.searching("new york");
        BrowserUtil.waitFor(2);
        search.textOutput();




    }
}
