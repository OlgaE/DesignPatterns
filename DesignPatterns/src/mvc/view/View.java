package mvc.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import mvc.model.Model;

@SuppressWarnings("serial")
public class View extends JFrame {

	private Model model;
	private JButton helloButton;
	
	public View(Model model){
		super("MVC demo");
		this.model = model;
		helloButton = new JButton("Click");
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.anchor = GridBagConstraints.CENTER;
		gc.gridheight = 0;
		gc.gridwidth = 0;
		gc.weighty = 1;
		gc.weightx = 1;
		gc.fill = GridBagConstraints.NONE;
		
		add(helloButton, gc);
		helloButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent event) {
				
				System.out.println("Hi there)");
			}
			
		});
		
		setSize(600, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
