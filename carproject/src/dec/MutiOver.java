package dec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MutiOver<K,V> {
	Map< K, V> map = new HashMap<>();
	// 泛型的使用
	public void put(K k,V v) {
		map.put(k, v);
	}
	
	public String get(K k) {
		return (String) map.get(k);
	}

	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
