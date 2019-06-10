package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase{


    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm("group");
        app.getGroupHelper().submitGroupCreation("submit");
    }
}


