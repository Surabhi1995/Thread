
public class App  {
	
	public static void main(String args[]) {
		
		Thread add= new AddRemove("ADD");
		Thread remove = new AddRemove("REM");
		
		add.start();
		remove.start();
		
	}

}
