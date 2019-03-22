package com.epam.reviewer.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.epam.reviewer.enums.Roles;

/**
 * The Class User.
 */
@Entity
@Table(name = "user")
public class User {

  /** The user id. */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id")
  int userId;

  /** The first name. */
  @Column(name = "first_name")
  String firstName;

  /** The last name. */
  @Column(name = "last_name")
  String lastName;

  /** The mail. */
  @Column(name = "mail")
  String mail;

  /** The password. */
  @Column(name = "password")
  String password;

  /** The role. */
  @Column(name = "role_id")
  @Enumerated
  Roles role;

  /**
   * Gets the user id.
   *
   * @return the userId
   */
  public int getUserId() {
    return userId;
  }

  /**
   * Sets the user id.
   *
   * @param userId the userId to set
   */
  public void setUserId(int userId) {
    this.userId = userId;
  }

  /**
   * Gets the first name.
   *
   * @return the firstName
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Sets the first name.
   *
   * @param firstName the firstName to set
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Gets the last name.
   *
   * @return the lastName
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Sets the last name.
   *
   * @param lastName the lastName to set
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Gets the mail.
   *
   * @return the mail
   */
  public String getMail() {
    return mail;
  }

  /**
   * Sets the mail.
   *
   * @param mail the mail to set
   */
  public void setMail(String mail) {
    this.mail = mail;
  }

  /**
   * Gets the password.
   *
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * Sets the password.
   *
   * @param password the password to set
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Gets the role.
   *
   * @return the role
   */
  public Roles getRole() {
    return role;
  }

  /**
   * Sets the role.
   *
   * @param role the role to set
   */
  public void setRole(Roles role) {
    this.role = role;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName
        + ", mail=" + mail + ", password=" + password + ", role=" + role + "]";
  }

}
