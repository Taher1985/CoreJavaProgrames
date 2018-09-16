package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class _2HowToSycnhronizeHashMapDemo {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map = Collections.synchronizedMap(map);

	}

}
