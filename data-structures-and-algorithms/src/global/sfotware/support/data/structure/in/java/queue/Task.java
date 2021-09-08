package global.sfotware.support.data.structure.in.java.queue;

/**
*
* brunolima on Jun 7, 2021
* 
*/

public class Task {
	
	private int id;

	public Task(int id) {
		this.id = id;
	}
	
	public void execute() {
		System.out.println("Executing task with id " + id);
	}
	

}

