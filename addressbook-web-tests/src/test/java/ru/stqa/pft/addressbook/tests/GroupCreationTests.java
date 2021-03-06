package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import org.openqa.selenium.*;


public class GroupCreationTests extends TestBase{


    @Test
    public void testGroupCreation() throws Exception {
        app.gotoGroupPage();
        app.getGroupsHelper().initGroupCreation("new");
        app.fillGroupForm();
        app.getGroupsHelper().submitGroupCreation("submit");
        app.getGroupsHelper().wd.findElement(By.linkText("home")).click();
        app.getGroupsHelper().wd.findElement(By.linkText("Logout")).click();
        app.getGroupsHelper().wd.findElement(By.name("user")).clear();
        app.getGroupsHelper().wd.findElement(By.name("user")).sendKeys("admin");
    }

}
