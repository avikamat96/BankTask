package com.epam.reviewer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.epam.reviewer.config.JpaUtil;
import com.epam.reviewer.models.Applicant;

/**
 * The Class ApplicantDaoImpl.
 */
public class ApplicantDaoImpl implements ApplicantDao {
  
  /** The em manager. */
  EntityManager emManager;
  
  /**
   * Instantiates a new applicant dao impl.
   */
  public ApplicantDaoImpl() {
    this.emManager = JpaUtil.getEntityManagerFactory().createEntityManager();
  }

 
  /**
   * Gets the all applicant.
   *
   * @return the all applicant
   */
  @Override
  public List<Applicant> getAllApplicant() {
    emManager.getTransaction().begin();
    Query query = emManager.createQuery("SELECT e FROM Applicant e");
    List<Applicant> applicants = query.getResultList();
    emManager.getTransaction().commit();
    emManager.close();
    return applicants;
  }

  /**
   * Gets the applicant.
   *
   * @param id the id
   * @return the applicant
   */
  @Override
  public Applicant getApplicant(int id) {  
    emManager.getTransaction().begin();
    Applicant applicant=emManager.find(Applicant.class,id);
    emManager.getTransaction().commit();
    emManager.close();
    return applicant;
  }

}
