package my_Packege.appmanager;

import my_Packege.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupHelper extends  HelperBase{

  public GroupHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void submitGroupCreation() {
    clik(By.name("submit"));
  }

  public void deleteSelectGroup() {
    clik(By.name("delete"));

  }

  public void selectGroup() {
    clik(By.name("selected[]"));
  }

  public void initGroupCreation() {
    clik(By.name("new"));
  }
}
