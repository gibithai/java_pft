package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper extends HelperBase  {
    private GroupData groupData;

    public GroupHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void returnToGroupPage() {{
        click(By.linkText("group page"));
    }}

    public void submitGroupCreation(String submit) {
        click(By.name(submit));
    }

    public void fillGroupForm(GroupData groupData) {

        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());


    }

    public void initGroupCreation () {
        click(By.name("new"));
    }

    public void deleteSelectedGroups() {
        click(By.xpath("(//input[@name='delete'])[2]"));
    }

    public void selectGroup() {
        click(By.xpath("(//input[@name='selected[]'])[2]"));
    }

    public void fillGroupForm(String group) {

    }
}