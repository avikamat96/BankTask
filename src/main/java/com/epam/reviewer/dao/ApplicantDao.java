package com.epam.reviewer.dao;

import java.util.List;

import com.epam.reviewer.models.Applicant;

/**
 * The Interface ApplicantDao.
 */
public interface ApplicantDao {

  /**
   * Gets the all applicant.
   *
   * @return the all applicant
   */
  List<Applicant> getAllApplicant();
  
  /**
   * Gets the applicant.
   *
   * @param id the id
   * @return the applicant
   */
  Applicant getApplicant(int id);
  
}
