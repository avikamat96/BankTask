package com.epam.reviewer.models;

import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.epam.reviewer.enums.ApplicationStatus;

/**
 * The Class Applicant.
 */
@Entity
@Table(name = "applicant_personal_details")
public class Applicant {
  
  /** The id. */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  int id;
  
  /** The user. */
  @OneToOne(cascade = CascadeType.ALL)
  User user;
  
  /** The phone no. */
  @Column(name = "phone_no")
  String phoneNo;
  
  /** The govt id number. */
  @Column(name = "govt_id_number")
  String govtIdNumber;
  
  /** The govt id proof. */
  @Column(name = "govt_id_proof")
  byte[] govtIdProof;
  
  /** The address. */
  @Column(name = "address")
  String address;
  
  /** The guardian name. */
  @Column(name = "guardian_name")
  String guardianName;
  
  /** The relation with guardian. */
  @Column(name = "relation_with_guardian")
  String relationWithGuardian;
  
  /** The application status. */
  @Column(name = "application_status")
  @Enumerated
  ApplicationStatus applicationStatus;

  /**
   * Gets the id.
   *
   * @return the id
   */
  public int getId() {
    return id;
  }

  /**
   * Sets the id.
   *
   * @param id the id to set
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Gets the phone no.
   *
   * @return the phoneNo
   */
  public String getPhoneNo() {
    return phoneNo;
  }

  /**
   * Sets the phone no.
   *
   * @param phoneNo the phoneNo to set
   */
  public void setPhoneNo(String phoneNo) {
    this.phoneNo = phoneNo;
  }

  /**
   * Gets the govt id number.
   *
   * @return the govtIdNumber
   */
  public String getGovtIdNumber() {
    return govtIdNumber;
  }

  /**
   * Sets the govt id number.
   *
   * @param govtIdNumber the govtIdNumber to set
   */
  public void setGovtIdNumber(String govtIdNumber) {
    this.govtIdNumber = govtIdNumber;
  }

  /**
   * Gets the govt id proof.
   *
   * @return the govtIdProof
   */
  public byte[] getGovtIdProof() {
    return govtIdProof;
  }

  /**
   * Sets the govt id proof.
   *
   * @param govtIdProof the govtIdProof to set
   */
  public void setGovtIdProof(byte[] govtIdProof) {
    this.govtIdProof = govtIdProof;
  }

  /**
   * Gets the address.
   *
   * @return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * Sets the address.
   *
   * @param address the address to set
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Gets the guardian name.
   *
   * @return the guardianName
   */
  public String getGuardianName() {
    return guardianName;
  }

  /**
   * Sets the guardian name.
   *
   * @param guardianName the guardianName to set
   */
  public void setGuardianName(String guardianName) {
    this.guardianName = guardianName;
  }

  /**
   * Gets the relation with guardian.
   *
   * @return the relationWithGuardian
   */
  public String getRelationWithGuardian() {
    return relationWithGuardian;
  }

  /**
   * Sets the relation with guardian.
   *
   * @param relationWithGuardian the relationWithGuardian to set
   */
  public void setRelationWithGuardian(String relationWithGuardian) {
    this.relationWithGuardian = relationWithGuardian;
  }

  /**
   * Gets the application status.
   *
   * @return the applicationStatus
   */
  public ApplicationStatus getApplicationStatus() {
    return applicationStatus;
  }

  /**
   * Sets the application status.
   *
   * @param applicationStatus the applicationStatus to set
   */
  public void setApplicationStatus(ApplicationStatus applicationStatus) {
    this.applicationStatus = applicationStatus;
  }

  /**
   * Gets the user.
   *
   * @return the user
   */
  public User getUser() {
    return user;
  }

  /**
   * Sets the user.
   *
   * @param user the user to set
   */
  public void setUser(User user) {
    this.user = user;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Applicant [id=" + id + ", user=" + user + ", phoneNo=" + phoneNo + ", govtIdNumber="
        + govtIdNumber + ", govtIdProof=" + Arrays.toString(govtIdProof) + ", address=" + address
        + ", guardianName=" + guardianName + ", relationWithGuardian=" + relationWithGuardian
        + ", applicationStatus=" + applicationStatus + "]";
  }

}
