package arrayLists;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> students=new ArrayList<String>();
		Student student1=new Student(1,"Serhat","Ata�",123456789);
		Student student2=new Student(2,"Burak","G�ltekin",123456789);
		Student student3=new Student(3,"Mine","Sa�lamc�",123456489);
		Student student4=new Student(4,"Engin","Demiro�",123456729);
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(student1);
		studentManager.add(student2);
		studentManager.add(student3);
		studentManager.add(student4);
		studentManager.delete(student1);
		studentManager.update(0,student2);
		for (Student student : studentManager.getAll()) {
			System.out.println(student.getFirstName());
		}
	}

}


// Student --> id, firstname ,lastname, identitynumber
//StudentMAnager--> getAll,delete,add,update
//Arraylist<Student> �zerinde y�net
//Bir ��renci iki kere kay�t olamaz.(tcden)