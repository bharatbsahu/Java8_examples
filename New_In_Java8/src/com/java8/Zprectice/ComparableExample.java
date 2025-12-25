package com.java8.Zprectice;

import java.util.*;



import java.io.*;

class Student implements Comparable<Student> {
	
	int rollno;
	String name;
	int age;
	
	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		if (age == o.age)
			return 0;
		else if (age > o.age)
			return 1;
		else
			return -1;
	}
	
	
}

public class ComparableExample {

	public static void main(String[] args) {
		System.out.println("******************** ComparableExample **********************");
		
		ArrayList<Student> arrSt = new ArrayList<Student>();
		
		arrSt.add(new Student(101, "Vijay", 23));
		arrSt.add(new Student(106, "Ajay", 27));
		arrSt.add(new Student(105, "Jai", 21));
		
		Collections.sort(arrSt);
		
		for (Student st : arrSt) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
	}

}
