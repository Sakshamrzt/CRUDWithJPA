package com.example.demo.model;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Customer {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  private String firstName;
  private String lastName;
  private String address;
  private String phoneNumber;
  private String email;
  private Date dateOfBirth;  
  protected Customer() {}

  public Customer(String firstName, String lastName,String address,String phoneNumber, String email, Date date) {
    this.firstName = firstName;
    this.lastName = lastName;    
    this.address=address;
    this.phoneNumber=phoneNumber;
    this.email=email;
    this.dateOfBirth=date;
  }

  @Override
  public String toString() {
    return String.format(
        "Customer[id=%d, firstName='%s', lastName='%s']",
        id, firstName, lastName,address,email,phoneNumber,dateOfBirth);
  }

  public Long getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }
   public void setFirstName(String first) {
     this.firstName=first;
  }

  public void setLastName(String last) {
    this.lastName=last;
  }

    public String getAddress() {
    return address;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }
   public void setAddress(String address) {
     this.address=address;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth=dateOfBirth;
  }
  
      public String getEmail() {
    return email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }
   public void setPhoneNumber(String phoneNumber) {
     this.phoneNumber=phoneNumber;
  }

  public void setEmail(String email) {
    this.email=email;
  }
}
