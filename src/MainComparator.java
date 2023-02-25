import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainComparator {

	public static void main(String[] args) {
		ComparatorStudent cs=new ComparatorStudent(4,6);
        ComparatorStudent cs1=new ComparatorStudent(5,8);
       System.out.println(cs.compareTo(cs1));
	
       Comparator<Integer> comparator=new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o1-o2;
		}
    	   
       };
	
	
	List<Integer> l=new ArrayList<>();
	l.add(1);
	l.add(2);
	l.add(5);
	l.add(3);
	for(Integer i : l) {
		System.out.println(i);
	}
	Collections.sort(l, comparator);
	
	
	System.out.println("-------------------------");
	for(Integer i : l) {
		System.out.println(i);
	}
	}
	
	
class AgeComparator implements Comparator<ComparatorStudent>{

	@Override
	public int compare(ComparatorStudent o1, ComparatorStudent o2) {
	
	return o1.age-o2.age;
	}


}
}
