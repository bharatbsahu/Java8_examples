package com.cg.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee
{
    int id;
     
    String name;
     
    int age;
     
    String gender;
     
    String department;
     
    int yearOfJoining;
     
    double salary;
     
    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }
     
    public int getId() 
    {
        return id;
    }
     
    public String getName() 
    {
        return name;
    }
     
    public int getAge() 
    {
        return age;
    }
     
    public String getGender() 
    {
        return gender;
    }
     
    public String getDepartment() 
    {
        return department;
    }
     
    public int getYearOfJoining() 
    {
        return yearOfJoining;
    }
     
    public double getSalary() 
    {
        return salary;
    }
     
    @Override
    public String toString() 
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }
}



public class Second_Max_Salary_of_employee {

	public static void main(String[] args) {
		System.out.println("Hi From => Second Max Salary of employee ");
	
	
	
		List<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		
		for(Employee e:employeeList) {
			System.out.println(e.toString()); 
		}
		
		/** Max Salary */
		Optional<Employee> emp = employeeList.stream()
									.collect(  
											
											Collectors.maxBy( Comparator.comparingDouble(Employee::getSalary)  )	
									);

		System.out.println("Max Salary -> " + emp.get().toString()); 
		
		/** Second Max Salary */
		Optional<Employee> emp1 = employeeList.stream()
				.sorted(
						Comparator.comparingDouble(Employee::getSalary).reversed()
				).skip(1).findFirst();
		
		System.out.println("Second Max Salary -> " + emp1.get().toString()); 
		
		/** Sorting on the basis of Salary ... */
		System.out.println("Sorting on the basis of Salary ...");  
		Collections.sort(employeeList,
				
				(e1, e2 ) -> Double.compare(e1.salary, e2.salary)
				
				);
		for(Employee e:employeeList) {System.out.println(e.toString()); }
		
		/** Sorting on the basis of Salary ... */
		System.out.println("Sorting on the basis of Salary Reverse ...");  
		Collections.reverse(employeeList);
		for(Employee e:employeeList) {System.out.println(e.toString()); }
		
		
		/** Second Max Salary */
		Optional<Employee> emp2 = employeeList.stream().skip(1).findFirst();
		
		System.out.println("Second Max Salary -> " + emp2.get().toString()); 
		
		/** Sorting on the basis of Name ... */
		System.out.println("Sorting on the basis of Name ... ");  
		
		Collections.sort(employeeList,
				
				(e1, e2) -> e1.name.compareTo(e2.name)
				
				);
		for(Employee e:employeeList) {System.out.println(e.toString()); }
		
		
		/** Sorting on the basis of ID ... */
		System.out.println("Sorting on the basis of ID ... ");  
		
		Collections.sort(employeeList,
				
					(E1, E2) -> Integer.compare(E1.id, E2.id)
				);
		
		for(Employee e:employeeList) {System.out.println(e.toString()); }
		
		/** Second Max Salary-2 */
		System.out.println("Second Max Salary-2"); 
		Collections.sort(employeeList,
				(S1, S2) -> Double.compare(S1.salary, S2.salary)
			);
		Collections.reverse(employeeList);
		Optional<Employee> emp4 = employeeList.stream().skip(1).findFirst();
		System.out.println("Second Max Salary-2 -> " + emp4.get().toString()); 
	}
}
