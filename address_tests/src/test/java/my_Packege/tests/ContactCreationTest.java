package my_Packege.tests;

import my_Packege.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() {
        app.getNavigationHelper().addNewCoptact();
        app.getContactHelper().fillNewContactForm(new ContactData("first_name", "middle_name", "last_name", "nickname", "title", "company", "address", "telephone_home", "telephone_mobile", "telephone_work", "fax"));
        app.getContactHelper().submitNewContactCreation();
    }

}
