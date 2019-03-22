package com.epam.reviewer.services;

import java.util.List;

import com.epam.reviewer.dao.ApplicantDao;
import com.epam.reviewer.dao.ApplicantDaoImpl;
import com.epam.reviewer.models.Applicant;

/**
 * The Class ReviewerService.
 */
public class ReviewerService {

  /** The applicant dao. */
  ApplicantDao applicantDao;

  /**
   * Instantiates a new reviewer service.
   */
  public ReviewerService() {
    applicantDao = new ApplicantDaoImpl();
  }

  /**
   * Gets the applicant details.
   *
   * @param applicantId the applicant id
   * @return the applicant details
   */
  public Applicant getApplicantDetails(int applicantId) {
    return applicantDao.getApplicant(applicantId);
  }

  /**
   * Gets the all applicants.
   *
   * @return the all applicants
   */
  public List<Applicant> getAllApplicants() {
    return applicantDao.getAllApplicant();

  }
}
