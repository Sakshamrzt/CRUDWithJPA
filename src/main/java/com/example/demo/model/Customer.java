package com.example.demo.model;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;;
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private @Getter @Setter Long id;
  private @Getter @Setter String firstName;
  private @Getter @Setter String lastName;
  private @Getter @Setter String address;
  private @Getter @Setter String phoneNumber;
  private @Getter @Setter String email;
  private @Getter @Setter Date dateOfBirth;  
  
}
