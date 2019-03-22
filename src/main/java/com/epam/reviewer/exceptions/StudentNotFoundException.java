package com.epam.reviewer.exceptions;

public class StudentNotFoundException extends Exception {

  private static final long serialVersionUID = 1L;

  /**
   * @param message
   */
  public StudentNotFoundException(String message) {
    super(message);
  }

}
