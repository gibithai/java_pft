package ru.stqa.pft.addressbook;

import org.testng.annotations.*;
import org.openqa.selenium.*;


public class GroupCreationTests extends TestBase{


    @Test
    public void testGroupCreation() throws Exception {
        app.gotoGroupPage();
        initGroupCreation("new");
        app.fillGroupForm(new GroupData("Test1", "Test2", "Test3"));
        app.submitGroupCreation("submit");
        app.wd.findElement(By.linkText("home")).click();
        app.wd.findElement(By.linkText("Logout")).click();
        app.wd.findElement(By.name("user")).clear();
        app.wd.findElement(By.name("user")).sendKeys("admin");
    }

}
