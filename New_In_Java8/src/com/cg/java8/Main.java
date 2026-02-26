package com.cg.java8;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;


import java.util.List;

import static java.util.stream.Collectors.*;
import java.util.*;

 

// Employee class (not public)


class Employeee {

    int eid;

    String ename;

    double salary;

    String designation;

    String department;

    public int getEid() { 		return eid; 	}
	public String getEname() { 		return ename;	}
	public double getSalary() { 		return salary; 	}
	public String getDesignation() { 		return designation; 	}
	public String getDepartment() { 		return department; 	}

	public Employeee(int eid, String ename, double salary, String designation, String department) {
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
        this.designation = designation;
        this.department = department;
    }

 
    @Override
    public String toString() {
        return eid + " | " + ename + " | " + salary + " | " +
               designation + " | " + department;

    }

}

 

public class Main {

    public static void main(String[] args) {

 

        ArrayList<Employeee> list = new ArrayList<>();

 

        list.add(new Employeee(101, "Aarav Mehta", 85000, "Software Engineer", "IT"));

        list.add(new Employeee(102, "Isha Sharma", 95000, "Senior Engineer", "IT"));

        list.add(new Employeee(103, "Rahul Gupta", 120000, "Team Lead", "IT"));

        list.add(new Employeee(104, "Neha Verma", 70000, "QA Engineer", "QA"));

        list.add(new Employeee(105, "Karan Patel", 110000, "HR Manager", "HR"));

        list.add(new Employeee(106, "Simran Kaur", 65000, "Business Analyst", "BA"));

        list.add(new Employeee(107, "Vikas Yadav", 130000, "Project Manager", "PMO"));

        list.add(new Employeee(108, "Priya Nair", 78000, "UI/UX Designer", "Design"));

        list.add(new Employeee(109, "Aditya Joshi", 90000, "Data Engineer", "Data"));

        list.add(new Employeee(110, "Ritika Singh", 105000, "DevOps Engineer", "DevOps"));

 
        // printing employees
        for (Employeee e : list) {
            System.out.println(e);
        }
        
        /** 1) Most common: groupingBy + counting */ 
        Map<String, Long> desgCnt = list.stream()
        						.collect(
        								groupingBy(Employeee::getDesignation, counting())
        						);
        desgCnt.forEach(
        			(str, lng) -> System.out.println("str:" + str + ", lng:"+lng)
        		);
        
        /** 2) Most common: groupingBy + counting Department */ 
        
        Map<String, Long> departCount = list.stream()
        		.collect(
        				groupingBy(Employeee::getDepartment, counting())
        		);
        
        departCount.forEach(
        			(str, lnng) -> {
        				
        				if(str == "IT")
        					System.out.println("strrrrrrr:" + str + ", lng:"+lnng);
        				
        			}
        		);	
        
    }

}