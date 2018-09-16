package map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class _4WeakHashMap {

	@Override
	public String toString() {
		return "Taher";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize called");
	}

	public static void main(String[] args) throws InterruptedException {
		_4WeakHashMap t = new _4WeakHashMap();
		Map<_4WeakHashMap, String> map = new WeakHashMap<>();
		map.put(t, "Ali");
		System.out.println(map);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(map);
		
		System.out.println();
		
		_4WeakHashMap t1 = new _4WeakHashMap();
		Map<_4WeakHashMap, String> map1 = new HashMap<>();
		map1.put(t1, "Ali");
		System.out.println(map1);
		t1 = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(map1);
	}

}
