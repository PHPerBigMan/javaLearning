package dec;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("name", "HWY");
		
		Collection<String> collection = map.values();
		Iterator<String> it = collection.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
 	}
}
