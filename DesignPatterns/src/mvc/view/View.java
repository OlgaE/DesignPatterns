package mvc.view;

import javax.swing.JFrame;

import mvc.model.Model;

@SuppressWarnings("serial")
public class View extends JFrame {

	private Model model;
	
	public View(Model model){
		super("MVC demo");
		this.model = model;
	}
}
