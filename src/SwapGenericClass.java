import java.util.List;

public class SwapGenericClass {
  public static <T> void swap(List<T> list, int i, int j) {
   T temp=list.get(i);
  list.set(i, list.get(j));
  list.set(j, temp);
  }
}