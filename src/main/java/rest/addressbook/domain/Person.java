package rest.addressbook.domain;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * A person entry in an address book
 */
public class Person {

  private String name;
  private int id;
  private String email;
  private URI href;
  private List<PhoneNumber> phoneList = new ArrayList<>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void addPhone(PhoneNumber phone) {
    getPhoneList().add(phone);
  }

  public List<PhoneNumber> getPhoneList() {
    return phoneList;
  }

  public void setPhoneList(List<PhoneNumber> phones) {
    this.phoneList = phones;
  }

  public boolean hasEmail() {
    return getEmail() != null;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public URI getHref() {
    return href;
  }

  public void setHref(URI href) {
    this.href = href;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o){
      return true;
    }
    if (o == null){
      return false;
    }
    if (getClass() != o.getClass()){
      return false;
    }
    else{
      Person otherP = (Person) o;
      return ((this.name == null && otherP.name == null)
              || (this.name != null && this.name.equals(otherP.name))) &&
              this.id == otherP.id &&
              ((this.email == null && otherP.email == null)
                      || (this.email != null && this.email.equals(otherP.email))) &&
              ((this.href == null && otherP.href == null)
                      || (this.href != null && this.href.equals(otherP.href))) &&
              this.phoneList.equals(otherP.phoneList);
    }
  }
}
