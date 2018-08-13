package com.kita.firstapplication.model;

import javax.faces.bean.*;
import java.io.*;

@ManagedBean(name = "user")
@SessionScoped
public class User implements Serializable {
	
	private String name;
	private String m_strPassword;
	
	private static final long serialVersionUID = -7352847258810509223L;
	
	public String getName() {
		return name;
	}
	
	public void setName(String p_strName) {
		name = p_strName;
	}
	
	public String getPassword() {
		return m_strPassword;
	}
	
	public void setPassword(String p_strPassword) {
		m_strPassword = p_strPassword;
	}
	
}