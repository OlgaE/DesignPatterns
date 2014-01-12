package mvc.controller;

import mvc.model.Model;
import mvc.view.LoginFormEvent;
import mvc.view.LoginListener;
import mvc.view.View;

public class Controller implements LoginListener {

	private Model model;
	private View view;
	
	public Controller(Model model, View view){
		this.model = model;
		this.view = view;
	}

	@Override
	public void loginPerformed(LoginFormEvent event) {
		System.out.println("Login event received: " + event.getName() + ", " + event.getPassward() + ".");
	}
}
