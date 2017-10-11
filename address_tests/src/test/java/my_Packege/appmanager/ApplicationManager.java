package my_Packege.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

  FirefoxDriver wd;

  private  ContactHelper contactHelper ;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  private SessionHelper sessionHelper;

  public void init() {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    navigationHelper= new NavigationHelper(wd);
    groupHelper = new GroupHelper(wd);
    sessionHelper= new SessionHelper(wd);
    contactHelper = new ContactHelper(wd);
    getSessionHelper().login("admin", "secret");
  }

  public void stop() {
     wd.quit();
  }



  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public SessionHelper getSessionHelper() {
    return sessionHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }

}
