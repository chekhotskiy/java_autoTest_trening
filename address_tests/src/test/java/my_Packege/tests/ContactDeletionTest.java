package my_Packege.tests;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {

  @Test
  public void testContactDeletion(){
    app.getContactHelper().selectContact();
    app.getContactHelper().deletionContact();
    app.getContactHelper().closeWindoow();
  }
}
