package Map;

import java.util.HashMap;

public class main {

	public static void main(String[] args) {
	HashMap<Teacher,Student> map=new HashMap<>();
    Student s1=new Student(1,"Qarib","Mathematics");
    Teacher t1=new Teacher(1,"Michael","Uni");
    map.put(t1, s1);
    System.out.println(map.get(t1).getName());
  String a="salam";
  a.startsWith("h");
	}

}
