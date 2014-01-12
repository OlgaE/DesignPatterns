package mvc;

import javax.swing.SwingUtilities;

import mvc.controller.Controller;
import mvc.model.Model;
import mvc.view.View;
import mvc.view.ViewActionListener;

public class Application {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				runApp();
			}
			
		});
	}
	
	public static void runApp(){
		Model model = new Model();
		ViewActionListener view = new ViewActionListener(model);
		
		Controller controller = new Controller(model, view);
		
		view.setLoginListener(controller);
	}
}
