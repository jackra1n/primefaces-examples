package com.test;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean
public class MainBean {

  private static Logger logger = Logger.getGlobal();

  private String output = "output";

  public String redirect() throws IOException {
    System.out.println("something");
    logger.log(Level.ALL, "something");
    output += "\noutput";
    FacesContext facesContext = FacesContext.getCurrentInstance();
    ExternalContext externalContext = facesContext.getExternalContext();
    externalContext.redirect("second.xhtml");
    return "Test";
  }

  public void doAction() {
    System.out.println("Im doing action");
    logger.log(Level.ALL, "do cation");
  }

  public String getName() {
    return "Main Bean";
  }

  public String getOutput() {
    return output;
  }

  public void setOutput(String output) {
    this.output = output;
  }
}
