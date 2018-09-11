package finalize;

public class _2ExplicitlyCallToFinalizeDemo {

	private static int i;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize called " + i++ + " time");
	}

	public static void main(String[] args) throws Throwable {
		_2ExplicitlyCallToFinalizeDemo demo = new _2ExplicitlyCallToFinalizeDemo();
		demo.finalize(); //its normal method call, won't destroy the object
		demo.finalize(); //its normal method call, won't destroy the object
		demo = null;
		System.gc(); //its GC call, destroy the object
	}

}
