package my_Packege.appmanager;

import my_Packege.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase {

  public ContactHelper(FirefoxDriver wd){
    super(wd);
  }

  public void selectContact(){
    if (!wd.findElement(By.id("MassCB")).isSelected()) {
      wd.findElement(By.id("MassCB")).click();
    }

  }

  public void submitNewContactCreation() {
      clik(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillNewContactForm(ContactData contactData) {
      type(By.name("firstname"),contactData.getFirst_name());
      type(By.name("middlename"),contactData.getMiddle_name());
      type(By.name("lastname"),contactData.getLast_name());
      type(By.name("nickname"),contactData.getNickname());
      type(By.name("title"),contactData.getTitle());
      type(By.name("company"),contactData.getCompany());
      type(By.name("address"),contactData.getAddress());
      type(By.name("home"),contactData.getTelephone_home());
      type(By.name("mobile"),contactData.getTelephone_mobile());
      type(By.name("work"),contactData.getTelephone_work());
      type(By.name("fax"),contactData.getFax());

  }

  public void deletionContact() {
    clik(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
  }

  public void closeWindoow() {
    wd.switchTo().alert().accept();
  }
}
