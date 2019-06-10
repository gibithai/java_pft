package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase{


    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupsHelper().initGroupCreation("new");
        app.getGroupsHelper().fillGroupForm("group");
        app.getGroupsHelper().submitGroupCreation("submit");
    }
}


