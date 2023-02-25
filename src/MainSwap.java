import java.util.ArrayList;
import java.util.List;

public class MainSwap {

	public static void listmethod(List<String> list) {
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			}
	}
	public static void main(String[] args) {
		SwapGenericClass gc=new SwapGenericClass();
List<String> list= new ArrayList<>();
list.add("salam");
list.add("aleykum");
list.add("necesen");
list.add("ne var ne yox");
listmethod(list);
gc.swap(list, 2, 3);
listmethod(list);
}
}
