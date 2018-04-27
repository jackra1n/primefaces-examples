package com.mkyong.editor;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "editor")
public class EditorBean {

	private String value = "This editor is provided by PrimeFaces";

private Number numberValue;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

public Number getNumberValue() { return numberValue; }
public void setNumberValue(Number nr) { numberValue = nr; }
}
