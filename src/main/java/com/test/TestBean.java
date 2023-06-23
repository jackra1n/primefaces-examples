package com.test;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TestBean {

  private static Logger logger = Logger.getGlobal();

  public static void redirect() {
    logger.log(Level.ALL, "something");
  }
}
