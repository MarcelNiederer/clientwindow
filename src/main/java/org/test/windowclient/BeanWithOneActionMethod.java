package org.test.windowclient;


import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.apache.deltaspike.core.api.scope.WindowScoped;


@RequestScoped
//@WindowScoped
@Named("Bean")
public class BeanWithOneActionMethod implements Serializable {
	private static final long serialVersionUID = 5434629804808298000L;

	// Fields
	private String checked;


	// Getters
	public String getChecked() {
		return checked;
	}


	// Actions
	public String lonelyActionMethod() {
		System.out.println("***** Was here in lonelyActionMethod() *****");
		checked = "yes";
		return null;
	}
}