package com.cg.java8.DesignPatterns;


final class Student {

	private final int id;
    private final String name;
    private final String address;
    
    public Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
	}
    
    public static class Builder {

        // instance fields
        private int id;
        private String name;
        private String address;
        
        public static Builder newInstance()
        {
            return new Builder();
        }

        private Builder() {}
        
        // build method to deal with outer class
        // to return outer instance
        public Student build()
        {
            return new Student(this);
        }
        
        // Setter methods
        public Builder setId(int id)
        {
            this.id = id;
            return this;
        }
        
        public Builder setName(String name)
        {
            this.name = name;
            return this;
        }
        
        public Builder setAddress(String address)
        {
            this.address = address;
            return this;
        }
    }
	
    @Override
    public String toString()
    {
        return "id = " + this.id + ", name = " + this.name + 
                            ", address = " + this.address;
    }
	
}


//Client Side Code
class StudentReceiver {
	
    // volatile student instance to ensure visibility
    // of shared reference to immutable objects
    private volatile Student student;
    
    public StudentReceiver() {
    	
    	
    	Thread t1 = new Thread(
    			
			new Runnable() {
	            @Override
	            public void run()
	            {
	            	student = Student.Builder.newInstance()
                            .setId(1)
                            .setName("Ram")
                            .setAddress("Noida")
                            .build();
	            }
	        }	
 
    	);
    	
    	Thread t2 = new Thread(
    			
    		new Runnable() {

				@Override
				public void run() {
					
					student = Student.Builder.newInstance() 
                            .setId(2)
                            .setName("Shyam")
                            .setAddress("Delhi")
                            .build();
					
				}
    			
    		}
    	);
    	
    	t1.start();
    	t2.start();
    	
    	try {
    		t1.join();
    		t2.join();
    		
    	} catch (InterruptedException e) {
            e.printStackTrace();
        }
    	
    }
    
    public Student getStudent() {
        return student;
    }
}

public class C_BuilderMethod_DesignPattern {

	public static void main(String[] args) {
		System.out.println("Hi From => Builder Method Design Pattern in Java");
		
		StudentReceiver _studentReceiver = new StudentReceiver();
		
		System.out.println(_studentReceiver.toString());
		
		System.out.println(_studentReceiver.getStudent());

	}

}
