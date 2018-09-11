package finalize;

class Worker {
	private int id;
	private String name;

	public Worker(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void finalize() {
		System.out.println("Finalize method called");
	}

}

public class _1FinalizeMethodDemo {

	public static void main(String[] args) {
		Worker worker1 = new Worker(123, "Ashok");

		worker1 = null;
		System.gc();
		System.out.println("End of main");
	}

}
