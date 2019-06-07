package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import ru.stqa.pft.addressbook.appmanager.GroupsHelper;


public class GroupCreationTests extends TestBase{


    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupsHelper().initGroupCreation("new");
        app.getGroupsHelper().fillGroupForm("group");
        app.getGroupsHelper().submitGroupCreation("submit");
        app.getGroupsHelper().wd.findElement(By.linkText("home")).click();
        app.getGroupsHelper().wd.findElement(By.name("user")).clear();
        app.getGroupsHelper().wd.findElement(By.name("user")).sendKeys("admin");
    }

}


