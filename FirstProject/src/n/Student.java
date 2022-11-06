package n;

import code.App;

/**
 * This class represents details of one student
 * @author Nideshika
 *@version 1.0 09/25/2022
 *@see "The Java Programming Language"
 *@see App
 */
public class Student {

	/**
	 * This is to store the name of the student
	 */
	private String name;
	/**
	 * This is to store the ID of the student
	 */
	private int stud_ID;
	/**
	 * This is to store the age of the student
	 */
	private int age;

	/**
	 * This is the constructor of the Student with the following parameters
	 * @param name of the student
	 * @param stud_ID  ID of the student
	 * @param age of the student
	 */
	public Student(String name, int stud_ID, int age) {
		super();
		this.name = name;
		this.stud_ID = stud_ID;
		this.age = age;
	}

	/**
	 * This method returns the name of a specific student
	 * @return a String 
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStud_ID() {
		return stud_ID;
	}

	public void setStud_ID(int stud_ID) {
		this.stud_ID = stud_ID;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
