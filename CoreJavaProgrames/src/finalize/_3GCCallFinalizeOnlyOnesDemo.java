package finalize;

class Company {
	private int id;
	private String name;
	private static int i = 0;
	public static Company comp;

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public void finalize() throws Throwable {
		System.out.println("Finalize called " + ++i);
		comp = this;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + "]";
	}

}

public class _3GCCallFinalizeOnlyOnesDemo extends Company {

	public static void main(String[] args) throws InterruptedException {
		Company company = new Company(123, "CSC");
		System.out.println("hashcode " + company.hashCode());

		company = null;
		System.gc();

		Thread.sleep(500);
		System.out.println("hashcode " + comp.hashCode());

		comp = null;
		System.gc();

	}

}
