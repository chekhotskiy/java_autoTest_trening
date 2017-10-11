package my_Packege.model;

public class ContactData {
  private final String first_name;
  private final String middle_name;
  private final String last_name;
  private final String nickname;
  private final String title;
  private final String company;
  private final String address;
  private final String telephone_home;
  private final String telephone_mobile;
  private final String telephone_work;
  private final String fax;

  public ContactData(String first_name, String middle_name, String last_name, String nickname, String title, String company, String address, String telephone_home, String telephone_mobile, String telephone_work, String fax) {
    this.first_name = first_name;
    this.middle_name = middle_name;
    this.last_name = last_name;
    this.nickname = nickname;
    this.title = title;
    this.company = company;
    this.address = address;
    this.telephone_home = telephone_home;
    this.telephone_mobile = telephone_mobile;
    this.telephone_work = telephone_work;
    this.fax = fax;
  }

  public String getFirst_name() {
    return first_name;
  }

  public String getMiddle_name() {
    return middle_name;
  }

  public String getLast_name() {
    return last_name;
  }

  public String getNickname() {
    return nickname;
  }

  public String getTitle() {
    return title;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getTelephone_home() {
    return telephone_home;
  }

  public String getTelephone_mobile() {
    return telephone_mobile;
  }

  public String getTelephone_work() {
    return telephone_work;
  }

  public String getFax() {
    return fax;
  }
}
