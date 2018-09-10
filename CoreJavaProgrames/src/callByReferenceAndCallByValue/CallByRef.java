package callByReferenceAndCallByValue;

class Worker {
	private String name;
	private Integer id;

	public Worker(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void swap(Object worker1, Object worker2) {
		Object temp = worker1;
		worker1 = worker2;
		worker2 = temp;
	}

	public void callByRef(Worker worker) {
		worker.setName("Nitin");
		worker.setId(456);

		worker = new Worker("Amit", 789);
	}
}

public class CallByRef {

	public static void main(String[] args) {

		Worker worker = new Worker("Taher", 123);
		Worker worker1 = new Worker("Taher1", 1231);
		System.out.println(worker.getName());
		System.out.println(worker.getId());

		System.out.println();

		worker.callByRef(worker);
		System.out.println(worker.getName());
		System.out.println(worker.getId());

		System.out.println();
		
		worker.swap(worker, worker1);
		System.out.println(worker.getName());
		System.out.println(worker.getId());
		System.out.println(worker1.getName());
		System.out.println(worker1.getId());
	}
}
