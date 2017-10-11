package my_Packege.tests;

import my_Packege.GroupData;
import org.testng.annotations.Test;


public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {

        app.goToGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("group", "header", "footer"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
