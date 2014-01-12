package mvc.view;

public class LoginFormEvent {

	private String name;
	private String passward;
	
	public LoginFormEvent(String name, String password){
		
		this.name = name;
		this.passward = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}
	
	
}
