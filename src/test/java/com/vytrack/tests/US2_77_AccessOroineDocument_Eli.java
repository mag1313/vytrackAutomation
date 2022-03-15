package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.VyTrack_Utilities;
import org.testng.annotations.Test;

public class US2_77_AccessOroineDocument_Eli extends TestBase {

    @Test
    public void verifyAccessAsSalesManager(){
        VyTrack_Utilities.loginAsSalesManager();

    }

    @Test
    public void verifyAccessAsStoreManager(){
        VyTrack_Utilities.loginAsSalesManager();

    }

    @Test
    public void verifyAccessAsDriver(){
        VyTrack_Utilities.loginAsDriver();

    }

}

//User Story: As a user, I should be able to access the Oroinc Documentation page.

//AC #1: Users access the Oronic Documentation page by clicking the question icon. The page URL: https://doc.oroinc.com/


/*
USERNAME:
TRUCK DRIVERS -- user166 - 171
STORE MANAGERS -- storemanager83 - storemanager86
SALES MANAGERS -- salesmanager251 - salesmanager254

PASSWORD:
UserUser123

ENV:
https://qa1.vytrack.com/user/login
 */