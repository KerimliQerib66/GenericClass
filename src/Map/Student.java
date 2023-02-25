package Map;

import java.util.Objects;

public class Student {
private int id;
private String name;
private String subject;
public Student(int id,String name,String subject) {
	this.id=id;
	this.name=name;
	this.subject=subject;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getSubject() {
	return subject;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setSubject(String subject) {
	this.subject = subject;
}
@Override
public int hashCode() {
	return id;
}


}
