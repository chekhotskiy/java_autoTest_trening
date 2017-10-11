package my_Packege.tests;

import my_Packege.appmanager.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {


  protected final ApplicationManager app = new ApplicationManager();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }

  public ApplicationManager getApp() {
    return app;
  }
}
