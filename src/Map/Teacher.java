package Map;

import java.util.Objects;

public class Teacher {
private int id;
private String name;
private String department;
public Teacher(int id,String name,String department) {
	this.id=id;
	this.name=name;
	this.department=department;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getDepartment() {
	return department;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setDepartment(String department) {
	this.department = department;
}
@Override
public int hashCode() {
	return Objects.hash(department, id, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Teacher other = (Teacher) obj;
	return Objects.equals(department, other.department) && id == other.id && Objects.equals(name, other.name);
}

}
