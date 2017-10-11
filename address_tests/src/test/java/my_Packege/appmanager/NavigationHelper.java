package my_Packege.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

  public NavigationHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void addNewCoptact() {
      clik(By.linkText("add new"));
  }

  public void returnToGroupPage() {
      clik(By.linkText("group page"));
  }

  public void goToGroupPage() {
      clik(By.linkText("groups"));
  }
}
