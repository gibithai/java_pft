package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupsHelper {
    public FirefoxDriver wd;
    private GroupData groupData;

    public GroupsHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void submitGroupCreation(String submit) { wd.findElement(By.name(submit)).click(); }

    public void fillGroupForm(GroupData groupData) {

        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());


    }

    public void deleteSelectedGroups() {
        wd.findElement(By.xpath("(//input[@name='delete'])[2]")).click();
    }

    public void selectGroup() {
        wd.findElement(By.xpath("(//input[@name='selected[]'])[2]")).click();
    }



    public void returnToGroupPage() {

    }

    public void initGroupCreation(String aNew) {

    }


    public void fillGroupForm(String group) {

    }

}