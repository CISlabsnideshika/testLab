
package code;

import java.util.ArrayList;

import n.Student;

/**
 * @author Nideshika
 * @version 1.0
 *
 *
 */
public class App {

	//static Student [] student=new Student[5];
	static ArrayList<Student> stud=new ArrayList<Student>();
	
	/**
	 * This is the first number
	 */
	public int num1;
	/**
	 * This is the second number
	 */
	public int num2;
	
	/**
	 * These are some private variables
	 */
	int x,y;

	/**
	 * This method adds n1 and n2 and return the answer
	 * @param n1 is the first number
	 * @param n2 is the second number
	 * @return the addition of n1 and n2
	 */
	public int addNumbers(int n1, int n2) {
		return n1 + n2;
	}
	
	private static void findStudent(int id) {
		Student s;
		for(int i=0;i<stud.size();i++) {
			if(stud.get(i).getStud_ID()==id) {
				display(stud.get(i).getName(), stud.get(i).getAge());
				break;
			}
		}
	}
	private static void display(String s, int a) {
		System.out.print(s+" "+ a);
	}
	
	public static void createList()
	{
		stud.add(new Student("aaa",1234,12));
		stud.add(new Student("bbb",345,23));
	}

	public static void main(String[] args) {
		createList();
		findStudent(345);
	}

}
