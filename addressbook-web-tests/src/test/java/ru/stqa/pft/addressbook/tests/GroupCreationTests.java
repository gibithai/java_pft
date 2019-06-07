package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import ru.stqa.pft.addressbook.appmanager.GroupsHelper;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase{


    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupsHelper().initGroupCreation("new");
        app.getGroupsHelper().fillGroupForm("group");
        app.getGroupsHelper().submitGroupCreation("submit");
        


    }

}


