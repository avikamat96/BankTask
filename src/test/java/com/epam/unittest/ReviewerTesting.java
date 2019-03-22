/**
 * 
 */
package com.epam.unittest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.epam.reviewer.dao.ApplicantDao;
import com.epam.reviewer.dao.ApplicantDaoImpl;
import com.epam.reviewer.models.Applicant;
import com.epam.reviewer.services.ReviewerService;

/**
 * @author Avinash_Kamat
 *
 */
class ReviewerTesting {
  @InjectMocks
  ReviewerService reviewerService;

  @Mock
  ApplicantDao applicantDao;

  @Mock
  ApplicantDaoImpl applicantDaoImpl;

  @BeforeEach
  void init() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  void shouldReturnApplicantObjectWhenGivenApplicantId() {
    Applicant applicant = new Applicant();
    when(applicantDao.getApplicant(1)).thenReturn(applicant);
   // when(reviewerService.getApplicantDetails(1)).thenReturn(applicant);
    assertEquals(reviewerService.getApplicantDetails(1), applicant);
  }

  @Test
  void shouldReturnListOfAllApplicants() {
    List<Applicant> list = new ArrayList<Applicant>();
    when(applicantDao.getAllApplicant()).thenReturn(list);
    //when(reviewerService.getAllApplicants()).thenReturn(list);
    assertEquals(reviewerService.getAllApplicants(), list);
  }
}
