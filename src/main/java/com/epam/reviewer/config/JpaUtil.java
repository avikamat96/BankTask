package com.epam.reviewer.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * The Class JpaUtil.
 */
public class JpaUtil {

  /** The Constant PERSISTENCE_UNIT_NAME. */
  public static final String PERSISTENCE_UNIT_NAME = "jpa";

  /** The emfactory. */
  public static EntityManagerFactory emfactory;

  /**
   * Instantiates a new jpa util.
   */
  private JpaUtil() {

  }

  /**
   * Gets the entity manager factory.
   *
   * @return the entity manager factory
   */
  public static EntityManagerFactory getEntityManagerFactory() {
    if (emfactory == null) {
      emfactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }
    return emfactory;
  }
  
  public static void shutdown() {
    if (emfactory != null) {
      emfactory.close();
    }
  }


}
