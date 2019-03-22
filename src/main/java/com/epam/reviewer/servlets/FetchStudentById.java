package com.epam.reviewer.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.epam.reviewer.models.Applicant;
import com.epam.reviewer.services.ReviewerService;

/**
 * Servlet implementation class FetchStudentById.
 */
@WebServlet("/FetchStudentById")
public class FetchStudentById extends HttpServlet {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /**
   * Instantiates a new fetch student by id.
   *
   * @see HttpServlet#HttpServlet()
   */
  public FetchStudentById() {
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
    try {
      int applicantId = Integer.parseInt(request.getParameter("applicantId"));
      ReviewerService service = new ReviewerService();
      Applicant applicant = service.getApplicantDetails(applicantId);
      HttpSession session = request.getSession();
      session.setAttribute("applicantObject", applicant);
      request.getRequestDispatcher("studentdetails.jsp").forward(request, response);
    } catch (NumberFormatException e) {
    }
  }

}
