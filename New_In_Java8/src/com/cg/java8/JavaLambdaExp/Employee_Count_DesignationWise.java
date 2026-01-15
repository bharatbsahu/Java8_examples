package com.cg.java8.JavaLambdaExp;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.*;
import java.util.*;

class Employe {
    private final long id;
    private final String name;
    private final String designation;
    
    public Employe(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }

    public long getId() { return id; }
    public String getName() { return name; }
    public String getDesignation() { return designation; }

	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}
}

public class Employee_Count_DesignationWise {

	public static void main(String[] args) {
		System.out.println("************8 Employee_Count_DesignationWise *************************");

		List<Employe> EmpList = new ArrayList<Employe>();

		EmpList.add(new Employe(23, "Vishnu", "Account"));
		EmpList.add(new Employe(29, "Shiva", "Software"));
		EmpList.add(new Employe(33, "Krishna", "Account"));
		EmpList.add(new Employe(35, "Vishnu", "Hardware"));
		EmpList.add(new Employe(38, "Deva", "Hardware"));

		for (Employe e : EmpList) {
			System.out.println(e.toString());
		}

		/** 1) Most common: groupingBy + counting */
		Map<String, Long> countByDesignation = EmpList.stream()
											.collect(
													groupingBy( Employe::getDesignation, counting() )
											);

		countByDesignation.forEach((desig, cnt) -> System.out.println(desig + " -> " + cnt));
		
		/** 4) Keep insertion order (e.g., order of first appearance) */
		
		

	}

}
