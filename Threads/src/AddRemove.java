import java.util.ArrayList;

public class AddRemove extends Thread {

	String name;
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static int production=0,consumption=1;

	
	public AddRemove(String name) {

		this.setName(name);

	}

	public void run() {

		if (this.getName().equals("ADD")) {

		
			add();
			
		
		}

		else {

			
			remove();

		}

	}

	public  void add() {

		for (int index = 1; index <= 10; index++) {

			list.add(index);
			System.out.println("added " + index);
			production++;
			
		}

	}

	public  void remove() {

		while (consumption <= 10) {
			

			 
			if(production > 0) 
			{	
			list.remove(0);
			System.out.println("removed " + consumption);
			production--;
			consumption++;
			}
			
			
		}
	}
}
