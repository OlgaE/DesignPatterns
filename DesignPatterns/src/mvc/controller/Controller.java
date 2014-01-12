package mvc.controller;

import mvc.model.Model;
import mvc.view.View;
import mvc.view.ViewActionListener;

public class Controller {

	private Model model;
	private ViewActionListener view;
	
	public Controller(Model model, ViewActionListener view){
		this.model = model;
		this.view = view;
	}
}
