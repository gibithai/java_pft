package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.appmanager.GroupsHelper;

public class SessionHelper {
    private FirefoxDriver wd;

    public SessionHelper(FirefoxDriver wd) {

        this.wd = wd;
    }
    public void login(String username, String password) {

        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.id("LoginForm")).submit();
        GroupsHelper.submitGroupCreation("user");
    }
}
