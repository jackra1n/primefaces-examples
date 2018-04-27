package com.mkyong.editor;

import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "editor")
public class EditorBean
{

  private String value = "This editor is provided by PrimeFaces";

  private Number numberValue;
  
  private Double doubleValue;

  public String getValue()
  {
    return value;
  }

  public void setValue(String value)
  {
    this.value = value;
  }

  public Number getNumberValue()
  {
    return numberValue;
  }

  public void setNumberValue(Number nr)
  {
    numberValue = nr;
  }

  public void save()
  {
  }

  public Double getDoubleValue()
  {
    return doubleValue;
  }

  public void setDoubleValue(Double doubleValue)
  {
    this.doubleValue = doubleValue;
  }
  
  public String getLocale() {
    Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
    return locale.getLanguage() + "_" + locale.getCountry();
  }
  
  public void setLocaleDe() {
    FacesContext.getCurrentInstance().getViewRoot().setLocale(Locale.GERMANY);
  }
  
  public void setLocaleEn() {
    FacesContext.getCurrentInstance().getViewRoot().setLocale(Locale.ENGLISH);
  }
}
