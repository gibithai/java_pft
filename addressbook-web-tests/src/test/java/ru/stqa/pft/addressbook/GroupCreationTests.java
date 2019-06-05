package ru.stqa.pft.addressbook;

import org.testng.annotations.*;
import org.openqa.selenium.*;


public class GroupCreationTests extends TestBase{


    @Test
    public void testGroupCreation() throws Exception {
        gotoGroupPage();
        initGroupCreation("new");
        fillGroupForm(new GroupData("Test1", "Test2", "Test3"));
        submitGroupCreation("submit");
        wd.findElement(By.linkText("home")).click();
        wd.findElement(By.linkText("Logout")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys("admin");
    }

}
