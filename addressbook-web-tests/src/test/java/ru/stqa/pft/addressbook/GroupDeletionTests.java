package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase{

  @Test
  public void testGroupDeletion() throws Exception {
    app.gotoGroupPage();
    app.selectGroup();
    app.deleteSelectedGroups();
    returnToGroupPage();
  }

  private void returnToGroupPage() {
    app.wd.findElement(By.linkText("group page")).click();
  }


}
