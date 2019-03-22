package com.epam.reviewer.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.epam.reviewer.models.Applicant;
import com.epam.reviewer.services.ReviewerService;

/**
 * Servlet implementation class GetNotReviewedApplicants.
 */
@WebServlet("/GetNotReviewedApplicants")
public class GetNotReviewedApplicants extends HttpServlet {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /**
   * Instantiates a new gets the not reviewed applicants.
   *
   * @see HttpServlet#HttpServlet()
   */
  public GetNotReviewedApplicants() {
    super();
  }

  /**
   * Do get.
   *
   * @param request  the request
   * @param response the response
   * @throws ServletException the servlet exception
   * @throws IOException      Signals that an I/O exception has occurred.
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doPost(request, response);
  }

  /**
   * Do post.
   *
   * @param request  the request
   * @param response the response
   * @throws ServletException the servlet exception
   * @throws IOException      Signals that an I/O exception has occurred.
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    HttpSession session = request.getSession();
    ReviewerService service = new ReviewerService();
    List<Applicant> applicants = service.getAllApplicants();
    session.setAttribute("applicants", applicants);
    response.sendRedirect("index.jsp");

  }

}
