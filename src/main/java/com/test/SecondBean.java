package com.test;

import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class SecondBean {

  private static Logger logger = Logger.getGlobal();

  public void initialize() throws InterruptedException {
    var sleepTime = 6000;
    logger.info("now im gonna sleep");
    Thread.sleep(sleepTime);
    logger.info(() -> "slept " + sleepTime + " ms");
  }
}
