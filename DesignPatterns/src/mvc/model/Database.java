package mvc.model;

public class Database {

	private static Database instance = new Database();
	private static Database instanceOld;
	
	private Database(){
	}
	
	public static Database getInstance(){
		return instance;
	}
	
	//
	// Or an old way, which is also called "lazy instantiation":
	// The instanceOld is created only when someone calls method getInstanceOld().
	//
	// But this is not "thread safe".
	//
	public static Database getInstanceOld(){
		if(instanceOld == null){
			instanceOld = new Database();
		}
		
		return instanceOld;
	}
}
