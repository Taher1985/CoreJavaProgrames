package exceptionhandling;

class BranchException extends Exception {
	private String message;

	public BranchException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}
}

public class _3ThrowWithTryCatchDemo {

	public static void branchTest(String branchRequested, String branchAvailable) {
		if (!branchRequested.equals(branchAvailable)) {
			BranchException e = new BranchException("Branch not Available");
			try {
				throw e;				
			} catch (BranchException e2) {
				e.printStackTrace();
			}
			System.out.println(branchAvailable + " only");
		}

	}

	public static void main(String[] args) throws BranchException {
		branchTest("Computer", "IT");
		System.out.println();
	}

}
