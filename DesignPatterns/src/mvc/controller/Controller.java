package mvc.controller;

import mvc.model.Model;
import mvc.view.LoginFormEvent;
import mvc.view.LoginListener;
import mvc.view.View;
import mvc.view.ViewActionListener;

public class Controller implements LoginListener {

	private Model model;
	private ViewActionListener view;
	
	public Controller(Model model, ViewActionListener view){
		this.model = model;
		this.view = view;
	}

	@Override
	public void loginPerformed(LoginFormEvent event) {
		System.out.println("Login event received: " + event.getName() + ", " + event.getPassward() + ".");
	}
}
