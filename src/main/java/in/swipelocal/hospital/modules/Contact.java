package in.swipelocal.hospital.modules;

import javax.persistence.*;


@Entity
@Table(name = "Contact")
public class Contact {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;
   private String firstname;
   private  String lastname;
   private  Integer phoneNumber;
   private  String email;

   @ManyToOne
   private Department department;


   public Contact(String firstname, String lastname, Integer phoneNumber, String email, Department department) {
      this.firstname = firstname;
      this.lastname = lastname;
      this.phoneNumber = phoneNumber;
      this.email = email;
      this.department = department;
   }




   public String getFirstname() {
      return firstname;
   }

   public void setFirstname(String firstname) {
      this.firstname = firstname;
   }

   public String getLastname() {
      return lastname;
   }

   public void setLastname(String lastname) {
      this.lastname = lastname;
   }

   public Integer getPhoneNumber() {
      return phoneNumber;
   }

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public Department getDepartment() {
      return department;
   }

   public void setDepartment(Department department) {
      this.department = department;
   }

   public void setPhoneNumber(Integer phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   @Override
   public String toString() {
      return "Contact{" +
              "id=" + id +
              ", firstname='" + firstname + '\'' +
              ", lastname='" + lastname + '\'' +
              ", phoneNumber=" + phoneNumber +
              ", email='" + email + '\'' +
              ", department=" + department +
              '}';
   }
}
