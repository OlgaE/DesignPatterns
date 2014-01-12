package mvc.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import mvc.model.Model;

@SuppressWarnings("serial")
public class ViewActionListener extends JFrame implements ActionListener {

	private Model model;
	private JButton helloButton;
	private JButton goodbyeButton;
	
	public ViewActionListener(Model model){
		super("MVC demo");
		this.model = model;
		helloButton = new JButton("Click");
		goodbyeButton = new JButton("See you soon)");
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.anchor = GridBagConstraints.CENTER;
		gc.gridx = 1;
		gc.gridy = 1;
		gc.weighty = 1;
		gc.weightx = 1;
		gc.fill = GridBagConstraints.NONE;
		
		add(helloButton, gc);
		helloButton.addActionListener(this);
		
		gc.anchor = GridBagConstraints.CENTER;
		gc.gridx = 1;
		gc.gridy = 2;
		gc.weighty = 1;
		gc.weightx = 1;
		gc.fill = GridBagConstraints.NONE;
		
		add(goodbyeButton, gc);
		goodbyeButton.addActionListener(this);
		
		goodbyeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("See you again soon)");
			}
		});
		
		setSize(600, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		JButton source = (JButton) event.getSource();
		if(source == helloButton){
			System.out.println("Hi there)");
		} else {System.out.println("Some other button.");}
	}
}
