package my_Packege.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends HelperBase {
  FirefoxDriver wd;


  public SessionHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void login(String userName, String password) {
    type(By.name("user"),userName);
    type(By.name("pass"),password);
    clik(By.xpath("//form[@id='LoginForm']/input[3]"));
  }


}
