
public class ComparatorStudent implements Comparable<ComparatorStudent>{
public int age;
public int rollno;
public ComparatorStudent(int age,int rollno) {
	this.age=age;
	this.rollno=rollno;
}

	@Override
	public int compareTo(ComparatorStudent o) {
		
		return this.age-o.age;
	}

}
