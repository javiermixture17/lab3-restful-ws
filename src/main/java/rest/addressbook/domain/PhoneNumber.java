package rest.addressbook.domain;

/**
 * A phone number
 */
public class PhoneNumber {

  private String number;
  private PhoneType type = PhoneType.HOME;

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public PhoneType getType() {
    return type;
  }

  public void setType(PhoneType type) {
    this.type = type;
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
      PhoneNumber otherPN = (PhoneNumber) o;
      return ((this.number == null && otherPN.number == null)
              || (this.number != null && this.number.equals(otherPN.number))) &&
              this.type.equals(otherPN.type);
    }
  }

}
