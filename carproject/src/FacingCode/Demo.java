package FacingCode;

import java.util.*;

public class Demo {
	public static void main(String[] args) {
		Set set = new HashSet();
		Person p1 = new Person(2, "hwy");
		Person p2 = new Person(1, "hwy");
		set.add(p1);
		set.add(p2);
		p2.id = 3;
		set.add(p2);
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
