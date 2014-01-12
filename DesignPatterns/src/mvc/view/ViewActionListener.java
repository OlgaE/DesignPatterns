package mvc.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import mvc.controller.Controller;
import mvc.model.Model;

@SuppressWarnings("serial")
public class ViewActionListener extends JFrame implements ActionListener {

	private Model model;
	private JButton helloButton;
	private JButton goodbyeButton;
	private JTextField nameField;
	private JPasswordField passwordField;
	
	private LoginListener loginListener;
	
	public ViewActionListener(Model model){
		super("MVC demo");
		this.model = model;
		helloButton = new JButton("Click");
		goodbyeButton = new JButton("See you soon)");
		nameField = new JTextField(10);
		passwordField = new JPasswordField(10);
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		gc.anchor = GridBagConstraints.LAST_LINE_END;
		gc.gridx = 1;
		gc.gridy = 1;
		gc.weighty = 1;
		gc.weightx = 1;
		gc.insets = new Insets(100, 0, 0, 10);
		gc.fill = GridBagConstraints.NONE;
		add(new JLabel("Name: "), gc);
		
		gc.anchor = GridBagConstraints.LAST_LINE_START;
		gc.gridx = 2;
		gc.gridy = 1;
		gc.weighty = 1;
		gc.weightx = 1;
		gc.insets = new Insets(100, 0, 0, 0);
		gc.fill = GridBagConstraints.NONE;
		add(nameField, gc);

		//
		gc.anchor = GridBagConstraints.LINE_END;
		gc.gridx = 1;
		gc.gridy = 2;
		gc.weighty = 1;
		gc.weightx = 1;
		gc.insets = new Insets(0, 0, 0, 10);
		gc.fill = GridBagConstraints.NONE;
		add(new JLabel("Password: "), gc);
		
		gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 2;
		gc.gridy = 2;
		gc.weighty = 1;
		gc.weightx = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.fill = GridBagConstraints.NONE;
		add(passwordField, gc);
		//
		
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.gridx = 2;
		gc.gridy = 3;
		gc.weighty = 100;
		gc.weightx = 1;
		gc.fill = GridBagConstraints.NONE;
		
		add(helloButton, gc);
		helloButton.addActionListener(this);
		
		/*gc.anchor = GridBagConstraints.CENTER;
		gc.gridx = 2;
		gc.gridy = 4;
		gc.weighty = 100;
		gc.weightx = 1;
		gc.fill = GridBagConstraints.NONE;
		
		add(goodbyeButton, gc);
		goodbyeButton.addActionListener(this);
		
		goodbyeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("See you again soon)");
			}
		});*/
		
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
		
		String password = new String(passwordField.getPassword());
		String name = nameField.getText();
		
		fireLoginEvent(new LoginFormEvent(name, password));
	}

	public void setLoginListener(LoginListener loginListener) {
		this.loginListener = loginListener;
	}
	
	public void fireLoginEvent(LoginFormEvent event){
		
		if(loginListener != null){
			loginListener.loginPerformed(event);
		}
	}
}
