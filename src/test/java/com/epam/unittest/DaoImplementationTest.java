/**
 * 
 */
package com.epam.unittest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.epam.reviewer.dao.ApplicantDaoImpl;
import com.epam.reviewer.models.Applicant;


/**
 * @author Avinash_Kamat
 *
 */
class DaoImplementationTest {
  
  @Test
  void shouldReturnListOfApplicantsWhenGivenApplicantId() {
    assertNotEquals(0, new ApplicantDaoImpl().getAllApplicant().size());
  }
   
  @Test
  void shouldReturnApplicantWhenGivenApplicantId() {
    assertEquals(1,new ApplicantDaoImpl().getApplicant(1).getId());
  }
}
