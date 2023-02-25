import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainIterator {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(4);
	    l.add(8);
	    l.add(6);
		Iterator<Integer> it=l.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}

	}

}
