package arrayLists;

import java.util.ArrayList;

public class StudentManager {
	ArrayList<Student> students=new ArrayList<Student>();
	public StudentManager() {
		
	}
	public void add(Student student) {
		for (Student student1 : students) {
			if (student1.getIdentityNumber()==student.getIdentityNumber()) {
				return;
			}
		}
		this.students.add(student);
	}
		
	public void delete(Student student) {
		students.remove(student);
	}
	public void update(int i,Student student) {
		students.set(0, student);
	
	}
	
	public ArrayList<Student> getAll(){
		return this.students;
	}

}
