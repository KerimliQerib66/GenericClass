
public class WildCardGenericClass <T extends Number> {
public T target;
public WildCardGenericClass(T target ) {
	this.target=target;
}
public <U extends Number> void getresult(U distance) {
	
	double Target=target.doubleValue();
	double Distance=distance.doubleValue();
	if(Target>=Distance) {
		System.out.println("congrulations");
	}
	else {
		System.out.println("keep going you have a "+(Distance-Target));
	}
}
}
