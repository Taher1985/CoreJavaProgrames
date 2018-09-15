package collectionListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class HowToSycnhronizeListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list = Collections.synchronizedList(list);
	}

}
