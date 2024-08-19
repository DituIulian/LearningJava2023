package concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {

	public static void main(String[] args) {
		
		//add - copy
		//get

		List<String> list = new CopyOnWriteArrayList<>();
		
		//Threads 3
		list.add("Ant");
		list.add("Bat");
		list.add("Cat");	
		
		//Threads 3 
		
		for(String element:list) {
			System.out.println(element);
		}
		
	}

}
